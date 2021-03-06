/*
* generated by Xtext
*/
grammar InternalGrammar;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package co.edu.uniandes.jsonToSql.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package co.edu.uniandes.jsonToSql.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.edu.uniandes.jsonToSql.services.GrammarGrammarAccess;

}

@parser::members {

 	private GrammarGrammarAccess grammarAccess;
 	
    public InternalGrammarParser(TokenStream input, GrammarGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Config";	
   	}
   	
   	@Override
   	protected GrammarGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleConfig
entryRuleConfig returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConfigRule()); }
	 iv_ruleConfig=ruleConfig 
	 { $current=$iv_ruleConfig.current; } 
	 EOF 
;

// Rule Config
ruleConfig returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_LITERACONFIG_0=RULE_LITERACONFIG
    { 
    newLeafNode(this_LITERACONFIG_0, grammarAccess.getConfigAccess().getLITERACONFIGTerminalRuleCall_0()); 
    }
this_COLON_1=RULE_COLON
    { 
    newLeafNode(this_COLON_1, grammarAccess.getConfigAccess().getCOLONTerminalRuleCall_1()); 
    }
this_LEFTPARENTESIS_2=RULE_LEFTPARENTESIS
    { 
    newLeafNode(this_LEFTPARENTESIS_2, grammarAccess.getConfigAccess().getLEFTPARENTESISTerminalRuleCall_2()); 
    }
this_LITERACONNECTION_3=RULE_LITERACONNECTION
    { 
    newLeafNode(this_LITERACONNECTION_3, grammarAccess.getConfigAccess().getLITERACONNECTIONTerminalRuleCall_3()); 
    }
this_COLON_4=RULE_COLON
    { 
    newLeafNode(this_COLON_4, grammarAccess.getConfigAccess().getCOLONTerminalRuleCall_4()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConfigAccess().getConecctionConnectionParserRuleCall_5_0()); 
	    }
		lv_conecction_5_0=ruleConnection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConfigRule());
	        }
       		set(
       			$current, 
       			"conecction",
        		lv_conecction_5_0, 
        		"Connection");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_LITERALMERGEDFIELDS_6=RULE_LITERALMERGEDFIELDS
    { 
    newLeafNode(this_LITERALMERGEDFIELDS_6, grammarAccess.getConfigAccess().getLITERALMERGEDFIELDSTerminalRuleCall_6_0()); 
    }
this_LEFTBRACKET_7=RULE_LEFTBRACKET
    { 
    newLeafNode(this_LEFTBRACKET_7, grammarAccess.getConfigAccess().getLEFTBRACKETTerminalRuleCall_6_1()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConfigAccess().getMergeFieldsMergedFieldParserRuleCall_6_2_0()); 
	    }
		lv_mergeFields_8_0=ruleMergedField		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConfigRule());
	        }
       		add(
       			$current, 
       			"mergeFields",
        		lv_mergeFields_8_0, 
        		"MergedField");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_COMA_9=RULE_COMA
    { 
    newLeafNode(this_COMA_9, grammarAccess.getConfigAccess().getCOMATerminalRuleCall_6_3_0()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConfigAccess().getMergeFieldsMergedFieldParserRuleCall_6_3_1_0()); 
	    }
		lv_mergeFields_10_0=ruleMergedField		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConfigRule());
	        }
       		add(
       			$current, 
       			"mergeFields",
        		lv_mergeFields_10_0, 
        		"MergedField");
	        afterParserOrEnumRuleCall();
	    }

)
))*this_RIGHTBRACKET_11=RULE_RIGHTBRACKET
    { 
    newLeafNode(this_RIGHTBRACKET_11, grammarAccess.getConfigAccess().getRIGHTBRACKETTerminalRuleCall_6_4()); 
    }
)?this_RIGHTPARENTESIS_12=RULE_RIGHTPARENTESIS
    { 
    newLeafNode(this_RIGHTPARENTESIS_12, grammarAccess.getConfigAccess().getRIGHTPARENTESISTerminalRuleCall_7()); 
    }
)
;





// Entry rule entryRuleConnection
entryRuleConnection returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConnectionRule()); }
	 iv_ruleConnection=ruleConnection 
	 { $current=$iv_ruleConnection.current; } 
	 EOF 
;

// Rule Connection
ruleConnection returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getConnectionAccess().getConnectionAction_0(),
            $current);
    }
)this_LEFTPARENTESIS_1=RULE_LEFTPARENTESIS
    { 
    newLeafNode(this_LEFTPARENTESIS_1, grammarAccess.getConnectionAccess().getLEFTPARENTESISTerminalRuleCall_1()); 
    }
(this_LITERALURL_2=RULE_LITERALURL
    { 
    newLeafNode(this_LITERALURL_2, grammarAccess.getConnectionAccess().getLITERALURLTerminalRuleCall_2_0()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConnectionAccess().getUrlEStringParserRuleCall_2_1_0()); 
	    }
		lv_url_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConnectionRule());
	        }
       		set(
       			$current, 
       			"url",
        		lv_url_3_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?(this_LITERALUSERNAME_4=RULE_LITERALUSERNAME
    { 
    newLeafNode(this_LITERALUSERNAME_4, grammarAccess.getConnectionAccess().getLITERALUSERNAMETerminalRuleCall_3_0()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConnectionAccess().getUsernameEStringParserRuleCall_3_1_0()); 
	    }
		lv_username_5_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConnectionRule());
	        }
       		set(
       			$current, 
       			"username",
        		lv_username_5_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?(this_LITERALPASSWORD_6=RULE_LITERALPASSWORD
    { 
    newLeafNode(this_LITERALPASSWORD_6, grammarAccess.getConnectionAccess().getLITERALPASSWORDTerminalRuleCall_4_0()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConnectionAccess().getPasswordEStringParserRuleCall_4_1_0()); 
	    }
		lv_password_7_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConnectionRule());
	        }
       		set(
       			$current, 
       			"password",
        		lv_password_7_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?this_RIGHTPARENTESIS_8=RULE_RIGHTPARENTESIS
    { 
    newLeafNode(this_RIGHTPARENTESIS_8, grammarAccess.getConnectionAccess().getRIGHTPARENTESISTerminalRuleCall_5()); 
    }
)
;





// Entry rule entryRuleMergedField
entryRuleMergedField returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMergedFieldRule()); }
	 iv_ruleMergedField=ruleMergedField 
	 { $current=$iv_ruleMergedField.current; } 
	 EOF 
;

// Rule MergedField
ruleMergedField returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_LEFTPARENTESIS_0=RULE_LEFTPARENTESIS
    { 
    newLeafNode(this_LEFTPARENTESIS_0, grammarAccess.getMergedFieldAccess().getLEFTPARENTESISTerminalRuleCall_0()); 
    }
(this_LITERALTABLENAME_1=RULE_LITERALTABLENAME
    { 
    newLeafNode(this_LITERALTABLENAME_1, grammarAccess.getMergedFieldAccess().getLITERALTABLENAMETerminalRuleCall_1_0()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMergedFieldAccess().getTableNameEStringParserRuleCall_1_1_0()); 
	    }
		lv_tableName_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMergedFieldRule());
	        }
       		set(
       			$current, 
       			"tableName",
        		lv_tableName_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?this_LITERALFIELDS_3=RULE_LITERALFIELDS
    { 
    newLeafNode(this_LITERALFIELDS_3, grammarAccess.getMergedFieldAccess().getLITERALFIELDSTerminalRuleCall_2()); 
    }
this_LEFTBRACKET_4=RULE_LEFTBRACKET
    { 
    newLeafNode(this_LEFTBRACKET_4, grammarAccess.getMergedFieldAccess().getLEFTBRACKETTerminalRuleCall_3()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMergedFieldAccess().getFieldsFieldParserRuleCall_4_0()); 
	    }
		lv_fields_5_0=ruleField		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMergedFieldRule());
	        }
       		add(
       			$current, 
       			"fields",
        		lv_fields_5_0, 
        		"Field");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_COMA_6=RULE_COMA
    { 
    newLeafNode(this_COMA_6, grammarAccess.getMergedFieldAccess().getCOMATerminalRuleCall_5_0()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMergedFieldAccess().getFieldsFieldParserRuleCall_5_1_0()); 
	    }
		lv_fields_7_0=ruleField		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMergedFieldRule());
	        }
       		add(
       			$current, 
       			"fields",
        		lv_fields_7_0, 
        		"Field");
	        afterParserOrEnumRuleCall();
	    }

)
))*this_RIGHTBRACKET_8=RULE_RIGHTBRACKET
    { 
    newLeafNode(this_RIGHTBRACKET_8, grammarAccess.getMergedFieldAccess().getRIGHTBRACKETTerminalRuleCall_6()); 
    }
this_LITERALATTRIBUTENAMES_9=RULE_LITERALATTRIBUTENAMES
    { 
    newLeafNode(this_LITERALATTRIBUTENAMES_9, grammarAccess.getMergedFieldAccess().getLITERALATTRIBUTENAMESTerminalRuleCall_7()); 
    }
this_LEFTBRACKET_10=RULE_LEFTBRACKET
    { 
    newLeafNode(this_LEFTBRACKET_10, grammarAccess.getMergedFieldAccess().getLEFTBRACKETTerminalRuleCall_8()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMergedFieldAccess().getAttributeNamesAttributeNameParserRuleCall_9_0()); 
	    }
		lv_attributeNames_11_0=ruleAttributeName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMergedFieldRule());
	        }
       		add(
       			$current, 
       			"attributeNames",
        		lv_attributeNames_11_0, 
        		"AttributeName");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_COMA_12=RULE_COMA
    { 
    newLeafNode(this_COMA_12, grammarAccess.getMergedFieldAccess().getCOMATerminalRuleCall_10_0()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMergedFieldAccess().getAttributeNamesAttributeNameParserRuleCall_10_1_0()); 
	    }
		lv_attributeNames_13_0=ruleAttributeName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMergedFieldRule());
	        }
       		add(
       			$current, 
       			"attributeNames",
        		lv_attributeNames_13_0, 
        		"AttributeName");
	        afterParserOrEnumRuleCall();
	    }

)
))*this_RIGHTBRACKET_14=RULE_RIGHTBRACKET
    { 
    newLeafNode(this_RIGHTBRACKET_14, grammarAccess.getMergedFieldAccess().getRIGHTBRACKETTerminalRuleCall_11()); 
    }
this_RIGHTPARENTESIS_15=RULE_RIGHTPARENTESIS
    { 
    newLeafNode(this_RIGHTPARENTESIS_15, grammarAccess.getMergedFieldAccess().getRIGHTPARENTESISTerminalRuleCall_12()); 
    }
)
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleAttributeName
entryRuleAttributeName returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAttributeNameRule()); }
	 iv_ruleAttributeName=ruleAttributeName 
	 { $current=$iv_ruleAttributeName.current; } 
	 EOF 
;

// Rule AttributeName
ruleAttributeName returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_LEFTPARENTESIS_0=RULE_LEFTPARENTESIS
    { 
    newLeafNode(this_LEFTPARENTESIS_0, grammarAccess.getAttributeNameAccess().getLEFTPARENTESISTerminalRuleCall_0()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeNameAccess().getOldFieldEStringParserRuleCall_1_0()); 
	    }
		lv_oldField_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeNameRule());
	        }
       		set(
       			$current, 
       			"oldField",
        		lv_oldField_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)?this_COMA_2=RULE_COMA
    { 
    newLeafNode(this_COMA_2, grammarAccess.getAttributeNameAccess().getCOMATerminalRuleCall_2()); 
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAttributeNameRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getAttributeNameAccess().getFinalFieldFieldCrossReference_3_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)this_RIGHTPARENTESIS_4=RULE_RIGHTPARENTESIS
    { 
    newLeafNode(this_RIGHTPARENTESIS_4, grammarAccess.getAttributeNameAccess().getRIGHTPARENTESISTerminalRuleCall_4()); 
    }
)
;





// Entry rule entryRuleField
entryRuleField returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFieldRule()); }
	 iv_ruleField=ruleField 
	 { $current=$iv_ruleField.current; } 
	 EOF 
;

// Rule Field
ruleField returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_LEFTPARENTESIS_0=RULE_LEFTPARENTESIS
    { 
    newLeafNode(this_LEFTPARENTESIS_0, grammarAccess.getFieldAccess().getLEFTPARENTESISTerminalRuleCall_0()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFieldRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)this_COMA_2=RULE_COMA
    { 
    newLeafNode(this_COMA_2, grammarAccess.getFieldAccess().getCOMATerminalRuleCall_2()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFieldAccess().getTypeFieldTypeEnumRuleCall_3_0()); 
	    }
		lv_type_3_0=ruleFieldType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFieldRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_3_0, 
        		"FieldType");
	        afterParserOrEnumRuleCall();
	    }

)
)?this_RIGHTPARENTESIS_4=RULE_RIGHTPARENTESIS
    { 
    newLeafNode(this_RIGHTPARENTESIS_4, grammarAccess.getFieldAccess().getRIGHTPARENTESISTerminalRuleCall_4()); 
    }
)
;





// Rule FieldType
ruleFieldType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='\'String\'' 
	{
        $current = grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='\'Integer\'' 
	{
        $current = grammarAccess.getFieldTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getFieldTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='\'Float\'' 
	{
        $current = grammarAccess.getFieldTypeAccess().getFloatEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getFieldTypeAccess().getFloatEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='\'Boolean\'' 
	{
        $current = grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_3()); 
    }
));



RULE_LITERACONFIG : '\'config\'';

RULE_LITERACONNECTION : '\'connection\'';

RULE_LITERALMERGEDFIELDS : '\'mergeFields\':';

RULE_LITERALTABLENAME : '\'tableName\':';

RULE_LITERALFIELDS : '\'fields\':';

RULE_LITERALATTRIBUTENAMES : '\'attributeNames\':';

RULE_LITERALURL : '\'url\':';

RULE_LITERALUSERNAME : '\'username\':';

RULE_LITERALPASSWORD : '\'password\':';

RULE_COLON : ':';

RULE_COMA : ',';

RULE_LEFTPARENTESIS : '{';

RULE_LEFTBRACKET : '[';

RULE_RIGHTBRACKET : ']';

RULE_RIGHTPARENTESIS : '}';

RULE_SINGLEQUOTE : '\'';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


