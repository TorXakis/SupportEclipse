/*
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.parser.antlr;

import com.google.inject.Inject;
import nl.tno.torxakis.language.parser.antlr.internal.InternalTorXakisDslParser;
import nl.tno.torxakis.language.services.TorXakisDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class TorXakisDslParser extends AbstractAntlrParser {

	@Inject
	private TorXakisDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTorXakisDslParser createParser(XtextTokenStream stream) {
		return new InternalTorXakisDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public TorXakisDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TorXakisDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}