package cn.wagentim.buymanager.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.wagentim.buymanager.persistance.CustomerEntity;
import cn.wagentim.buymanager.persistance.CustomerManager;
import cn.wagentim.buymanager.utils.Utils;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/customer")
public class CustomerServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    private static final List<CustomerEntity> customers = CustomerManager.instance.getCustomers();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() 
    {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		Map<String, String[]> paraMap = request.getParameterMap();
		out.print("<html><header></header><body>");
		
		if( paraMap.isEmpty() )
		{
			int size = customers.size();
			CustomerEntity[] entities = customers.toArray(new CustomerEntity[size]);
			if( entities.length < 1 )
			{
				out.print("No Customer");
			}
			else
			{
				out.print(Utils.toJson(entities));
			}
			
		}
		else if( paraMap.get("add")[0].equals("1") )
		{
			CustomerEntity no = new CustomerEntity();
			no.setAddress("bei jing");
			no.setCity("bei jing");
			no.setContury("china");
			no.setFirstName("wei");
			no.setLastName("gong");
			no.setOther("");
			no.setProvince("beijing");
			no.setTelefon("55555555");
			no.setZipcode("011111");
			
			CustomerManager.instance.addCustomer(no);
			out.print("add new customer" + no.getFirstName() + " : " + no.getLastName());
		}
		
		out.print("</body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
	}

}
