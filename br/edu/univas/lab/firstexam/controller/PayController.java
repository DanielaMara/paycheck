package br.edu.univas.lab.firstexam.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.univas.lab.firstexam.service.PayService;


@WebServlet("/PayController")
public class PayController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Float salary = Float.valueOf(request.getParameter("salary"));
		
		Float inss = PayService.calculateInss(salary);
		
		Float irps = PayService.calculateIrpf(salary, inss);
		
		Float salaryLiquid = PayService.calculateSalaryLiquid(salary, inss, irps);
		
		response.getWriter().append(inss.toString() + "|" + irps.toString() + "|" + salaryLiquid.toString());
	}
}
