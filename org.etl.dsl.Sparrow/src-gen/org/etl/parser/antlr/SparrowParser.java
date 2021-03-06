/*
* generated by Xtext
*/
package org.etl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.etl.services.SparrowGrammarAccess;

public class SparrowParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SparrowGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.etl.parser.antlr.internal.InternalSparrowParser createParser(XtextTokenStream stream) {
		return new org.etl.parser.antlr.internal.InternalSparrowParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Process";
	}
	
	public SparrowGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SparrowGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
