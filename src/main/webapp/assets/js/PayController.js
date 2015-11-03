
var PayController = {
    
    init: function()
    {
        PayController.setForm();
    },
    
    setForm: function()
    {
        var form = document.querySelector('form');
        form.addEventListener('submit',function(event)
        {
            PayController.sendForm();
            event.preventDefault();
        });
    },
    
    sendForm: function()
    {   	
        PayService.sendInformation(function(callbackService)
        {
            if(callbackService != null)
            {
                PayController.showResult(callbackService,1);
            }
            else
            {
            	PayController.showResult(callbackService,0);
            }
        });
    },
    
    showResult: function(result, flag)
    {
    	if(flag == 1)
    	{
	    	var 
	    	results = result.split("|"),
	    	spanInss = document.getElementById("inss"),
	    	spanIppf = document.getElementById("irpf"),
	    	spanLiquidSalary = document.getElementById("salaryLiquid");    	
	    	
			spanInss.innerHTML = results[0];
			spanIppf.innerHTML = results[1];
			spanLiquidSalary.innerHTML = results[2];
    	}
    }
}

//inicialização
PayController.init();