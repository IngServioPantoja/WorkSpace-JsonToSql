/*
* generated by Xtext
*/
package co.edu.uniandes.jsonToSql.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import co.edu.uniandes.jsonToSql.services.GrammarGrammarAccess;

public class GrammarParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private GrammarGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected co.edu.uniandes.jsonToSql.parser.antlr.internal.InternalGrammarParser createParser(XtextTokenStream stream) {
		return new co.edu.uniandes.jsonToSql.parser.antlr.internal.InternalGrammarParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Config";
	}
	
	public GrammarGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GrammarGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}