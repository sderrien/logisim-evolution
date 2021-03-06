/*
 * generated by Xtext
 */
package com.cburch.logisim.statemachine.formatting

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
// import com.google.inject.Inject;
import static com.cburch.logisim.statemachine.services.FSMDSLGrammarAccess.*
import com.google.inject.Inject
import com.cburch.logisim.statemachine.services.FSMDSLGrammarAccess
import com.cburch.logisim.statemachine.fSMDSL.State
import org.eclipse.xtext.formatting2.IFormattableDocument

/**
 * This class contains custom formatting declarations.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#formatting
 * on how and when to use it.
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class FSMDSLFormatter extends AbstractDeclarativeFormatter {

	@Inject extension FSMDSLGrammarAccess
	
	override protected void configureFormatting(FormattingConfig c) {
// It's usually a good idea to activate the following three statements.
// They will add and preserve newlines around comments

		c.setLinewrap().after(layoutInfoRule)   
		//c.setLinewrap().after(transitionRule)
		c.setLinewrap().after(commandRule)
		//c.setLinewrap().after(commandListAccess.leftCurlyBracketKeyword_1_2)
		c.setLinewrap().after(commandListRule)
		
		c.setLinewrap().after(commandRule)
//		c.setLinewrap().after(stateRule)
//		c.setLinewrap().after(stateAccess.leftCurlyBracketKeyword_5)
		//c.setLinewrap().after(stateAccess.leftCurlyBracketKeyword_8_1)
		//c.setLinewrap().after(stateAccess.rightCurlyBracketKeyword_8_3)
		//c.setLinewrap().after(stateAccess.rightCurlyBracketKeyword_9)
		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)
	}
	
}

