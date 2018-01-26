package com.wangran.soap.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//import com.oracle.webservices.api.EnvelopeStyle.Style;
/**
 * Soap binding influence the input and output of user soap web service
 * @webparam change the default input name
 * eg
 * <message name="getProductCategories">
 *  <part name="xxxx" element="tns:getProductCategories"/>
 *  
 *  <message name="getShopInfoResponse">
	<part name="Result" type="xsd:string"/>
	</message>
 *	
 * @author wr
 *
 */
@WebService
@SOAPBinding(style=Style.RPC)
public class ShopInfo {
	@WebMethod
	public @WebResult(partName="Result") String getShopInfo(@WebParam(partName="xxxx") String property){
		String resp = "Invalid property";
		if("shopName".equals(property)){
			resp = "Test Ran";
		}
		return resp;
	}
}
