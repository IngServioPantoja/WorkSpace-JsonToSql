/*
* generated by Xtext
*/
package co.edu.uniandes.jsonToSql;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class GrammarUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return co.edu.uniandes.jsonToSql.ui.internal.GrammarActivator.getInstance().getInjector("co.edu.uniandes.jsonToSql.Grammar");
	}
	
}