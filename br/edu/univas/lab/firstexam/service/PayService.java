package br.edu.univas.lab.firstexam.service;

public class PayService 
{
	public PayService()
	{
		
	}
	
	public static Float calculateInss(Float salary)
	{
		Float inss = 0F;
		
		if(salary <= 1399.12)
		{
			inss = (salary * 8)/100;
		}
		else if(salary > 1399.12 && salary <= 2331.88)
		{
			inss = (salary * 9)/100;
		}
		else if(salary > 2331.88 && salary <= 4663.75)
		{
			inss = (salary * 11)/100;
		}
		else
		{
			inss = 513.02F;
		}
		
		return inss;
	}
	
	
	public static Float calculateIrpf(Float salary, Float inss)
	{
		Float salaryIrpf = salary - inss;
		Float irpf;
		
		if(salaryIrpf <= 1903.98 )
		{
			irpf = 0F;
		}
		else if(salaryIrpf > 1903.98 && salaryIrpf <= 2826.65)
		{
			irpf = ((salaryIrpf * 7.5F)/100) - 142.8F;
		}
		else if(salaryIrpf > 2826.65 && salaryIrpf <= 3751.05)
		{
			irpf = ((salaryIrpf * 15)/100) - 354.8F;
		}
		else if(salaryIrpf > 3751.05 && salaryIrpf <= 4664.68)
		{
			irpf = ((salaryIrpf * 22.5F)/100) - 636.13F;
		}
		else
		{
			irpf = ((salaryIrpf * 27.5F)/100) - 869.36F;
		}
		
		return irpf;
	}
	
	
	public static Float calculateSalaryLiquid(Float salary, Float inss, Float irps)
	{
		return salary - inss - irps;
	}
}
