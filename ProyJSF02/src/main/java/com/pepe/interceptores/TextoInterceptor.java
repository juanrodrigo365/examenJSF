package com.pepe.interceptores;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import com.pepe.anotaciones.Texto;

@Interceptor
@Texto
public class TextoInterceptor {
	@AroundInvoke
	public Object TextoInvocacion(InvocationContext con) throws Exception{
		long inicio = System.currentTimeMillis();
		Object resultado = con.proceed();
		String parametro = (String) con.getParameters()[1];
		if(parametro ==  null)
			con.setParameters(new String[] {"Sin Texto"});
		//return resultado.toString() + " tiempo calculado: " + 
		//		(System.currentTimeMillis() - inicio) + "[ms].";
		return parametro.substring(0,50);
		//return resultado.toString() + " tiempo calculado: " + 
		//		(System.currentTimeMillis() - inicio) + "[ms].";
	}
}
