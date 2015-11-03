
var PayService = {
    
    sendInformation: function (callback) 
    {
    	debugger;
    	var dadosForm = $("form").serialize();
    	        
		$.ajax({
			url: 'PayController',
			data: dadosForm,
			
			success: function (result) 
			{
				callback(result);
			},
			error: function () 
			{	
				callback(null);
			}
		});
	}
}