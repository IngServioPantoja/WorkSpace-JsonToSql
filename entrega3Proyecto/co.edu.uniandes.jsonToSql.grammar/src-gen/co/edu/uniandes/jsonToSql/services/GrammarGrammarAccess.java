/*
* generated by Xtext
*/
package co.edu.uniandes.jsonToSql.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class GrammarGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ConfigElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Config");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLITERACONFIGTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cCOLONTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cLEFTPARENTESISTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cLITERACONNECTIONTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final RuleCall cCOLONTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Assignment cConecctionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cConecctionConnectionParserRuleCall_5_0 = (RuleCall)cConecctionAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final RuleCall cLITERALMERGEDFIELDSTerminalRuleCall_6_0 = (RuleCall)cGroup_6.eContents().get(0);
		private final RuleCall cLEFTBRACKETTerminalRuleCall_6_1 = (RuleCall)cGroup_6.eContents().get(1);
		private final Assignment cMergeFieldsAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cMergeFieldsMergedFieldParserRuleCall_6_2_0 = (RuleCall)cMergeFieldsAssignment_6_2.eContents().get(0);
		private final Group cGroup_6_3 = (Group)cGroup_6.eContents().get(3);
		private final RuleCall cCOMATerminalRuleCall_6_3_0 = (RuleCall)cGroup_6_3.eContents().get(0);
		private final Assignment cMergeFieldsAssignment_6_3_1 = (Assignment)cGroup_6_3.eContents().get(1);
		private final RuleCall cMergeFieldsMergedFieldParserRuleCall_6_3_1_0 = (RuleCall)cMergeFieldsAssignment_6_3_1.eContents().get(0);
		private final RuleCall cRIGHTBRACKETTerminalRuleCall_6_4 = (RuleCall)cGroup_6.eContents().get(4);
		private final RuleCall cRIGHTPARENTESISTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		
		//Config:
		//	LITERACONFIG COLON LEFTPARENTESIS LITERACONNECTION COLON conecction=Connection (LITERALMERGEDFIELDS LEFTBRACKET
		//	mergeFields+=MergedField (COMA mergeFields+=MergedField)* RIGHTBRACKET)? RIGHTPARENTESIS;
		public ParserRule getRule() { return rule; }

		//LITERACONFIG COLON LEFTPARENTESIS LITERACONNECTION COLON conecction=Connection (LITERALMERGEDFIELDS LEFTBRACKET
		//mergeFields+=MergedField (COMA mergeFields+=MergedField)* RIGHTBRACKET)? RIGHTPARENTESIS
		public Group getGroup() { return cGroup; }

		//LITERACONFIG
		public RuleCall getLITERACONFIGTerminalRuleCall_0() { return cLITERACONFIGTerminalRuleCall_0; }

		//COLON
		public RuleCall getCOLONTerminalRuleCall_1() { return cCOLONTerminalRuleCall_1; }

		//LEFTPARENTESIS
		public RuleCall getLEFTPARENTESISTerminalRuleCall_2() { return cLEFTPARENTESISTerminalRuleCall_2; }

		//LITERACONNECTION
		public RuleCall getLITERACONNECTIONTerminalRuleCall_3() { return cLITERACONNECTIONTerminalRuleCall_3; }

		//COLON
		public RuleCall getCOLONTerminalRuleCall_4() { return cCOLONTerminalRuleCall_4; }

		//conecction=Connection
		public Assignment getConecctionAssignment_5() { return cConecctionAssignment_5; }

		//Connection
		public RuleCall getConecctionConnectionParserRuleCall_5_0() { return cConecctionConnectionParserRuleCall_5_0; }

		//(LITERALMERGEDFIELDS LEFTBRACKET mergeFields+=MergedField (COMA mergeFields+=MergedField)* RIGHTBRACKET)?
		public Group getGroup_6() { return cGroup_6; }

		//LITERALMERGEDFIELDS
		public RuleCall getLITERALMERGEDFIELDSTerminalRuleCall_6_0() { return cLITERALMERGEDFIELDSTerminalRuleCall_6_0; }

		//LEFTBRACKET
		public RuleCall getLEFTBRACKETTerminalRuleCall_6_1() { return cLEFTBRACKETTerminalRuleCall_6_1; }

		//mergeFields+=MergedField
		public Assignment getMergeFieldsAssignment_6_2() { return cMergeFieldsAssignment_6_2; }

		//MergedField
		public RuleCall getMergeFieldsMergedFieldParserRuleCall_6_2_0() { return cMergeFieldsMergedFieldParserRuleCall_6_2_0; }

		//(COMA mergeFields+=MergedField)*
		public Group getGroup_6_3() { return cGroup_6_3; }

		//COMA
		public RuleCall getCOMATerminalRuleCall_6_3_0() { return cCOMATerminalRuleCall_6_3_0; }

		//mergeFields+=MergedField
		public Assignment getMergeFieldsAssignment_6_3_1() { return cMergeFieldsAssignment_6_3_1; }

		//MergedField
		public RuleCall getMergeFieldsMergedFieldParserRuleCall_6_3_1_0() { return cMergeFieldsMergedFieldParserRuleCall_6_3_1_0; }

		//RIGHTBRACKET
		public RuleCall getRIGHTBRACKETTerminalRuleCall_6_4() { return cRIGHTBRACKETTerminalRuleCall_6_4; }

		//RIGHTPARENTESIS
		public RuleCall getRIGHTPARENTESISTerminalRuleCall_7() { return cRIGHTPARENTESISTerminalRuleCall_7; }
	}

	public class ConnectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Connection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cConnectionAction_0 = (Action)cGroup.eContents().get(0);
		private final RuleCall cLEFTPARENTESISTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final RuleCall cLITERALURLTerminalRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final Assignment cUrlAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cUrlEStringParserRuleCall_2_1_0 = (RuleCall)cUrlAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final RuleCall cLITERALUSERNAMETerminalRuleCall_3_0 = (RuleCall)cGroup_3.eContents().get(0);
		private final Assignment cUsernameAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cUsernameEStringParserRuleCall_3_1_0 = (RuleCall)cUsernameAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final RuleCall cLITERALPASSWORDTerminalRuleCall_4_0 = (RuleCall)cGroup_4.eContents().get(0);
		private final Assignment cPasswordAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cPasswordEStringParserRuleCall_4_1_0 = (RuleCall)cPasswordAssignment_4_1.eContents().get(0);
		private final RuleCall cRIGHTPARENTESISTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//Connection:
		//	{Connection} LEFTPARENTESIS (LITERALURL url=EString)? (LITERALUSERNAME username=EString)? (LITERALPASSWORD
		//	password=EString)? RIGHTPARENTESIS;
		public ParserRule getRule() { return rule; }

		//{Connection} LEFTPARENTESIS (LITERALURL url=EString)? (LITERALUSERNAME username=EString)? (LITERALPASSWORD
		//password=EString)? RIGHTPARENTESIS
		public Group getGroup() { return cGroup; }

		//{Connection}
		public Action getConnectionAction_0() { return cConnectionAction_0; }

		//LEFTPARENTESIS
		public RuleCall getLEFTPARENTESISTerminalRuleCall_1() { return cLEFTPARENTESISTerminalRuleCall_1; }

		//(LITERALURL url=EString)?
		public Group getGroup_2() { return cGroup_2; }

		//LITERALURL
		public RuleCall getLITERALURLTerminalRuleCall_2_0() { return cLITERALURLTerminalRuleCall_2_0; }

		//url=EString
		public Assignment getUrlAssignment_2_1() { return cUrlAssignment_2_1; }

		//EString
		public RuleCall getUrlEStringParserRuleCall_2_1_0() { return cUrlEStringParserRuleCall_2_1_0; }

		//(LITERALUSERNAME username=EString)?
		public Group getGroup_3() { return cGroup_3; }

		//LITERALUSERNAME
		public RuleCall getLITERALUSERNAMETerminalRuleCall_3_0() { return cLITERALUSERNAMETerminalRuleCall_3_0; }

		//username=EString
		public Assignment getUsernameAssignment_3_1() { return cUsernameAssignment_3_1; }

		//EString
		public RuleCall getUsernameEStringParserRuleCall_3_1_0() { return cUsernameEStringParserRuleCall_3_1_0; }

		//(LITERALPASSWORD password=EString)?
		public Group getGroup_4() { return cGroup_4; }

		//LITERALPASSWORD
		public RuleCall getLITERALPASSWORDTerminalRuleCall_4_0() { return cLITERALPASSWORDTerminalRuleCall_4_0; }

		//password=EString
		public Assignment getPasswordAssignment_4_1() { return cPasswordAssignment_4_1; }

		//EString
		public RuleCall getPasswordEStringParserRuleCall_4_1_0() { return cPasswordEStringParserRuleCall_4_1_0; }

		//RIGHTPARENTESIS
		public RuleCall getRIGHTPARENTESISTerminalRuleCall_5() { return cRIGHTPARENTESISTerminalRuleCall_5; }
	}

	public class MergedFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MergedField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLEFTPARENTESISTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cLITERALTABLENAMETerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Assignment cTableNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTableNameEStringParserRuleCall_1_1_0 = (RuleCall)cTableNameAssignment_1_1.eContents().get(0);
		private final RuleCall cLITERALFIELDSTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cLEFTBRACKETTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cFieldsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFieldsFieldParserRuleCall_4_0 = (RuleCall)cFieldsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final RuleCall cCOMATerminalRuleCall_5_0 = (RuleCall)cGroup_5.eContents().get(0);
		private final Assignment cFieldsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cFieldsFieldParserRuleCall_5_1_0 = (RuleCall)cFieldsAssignment_5_1.eContents().get(0);
		private final RuleCall cRIGHTBRACKETTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final RuleCall cLITERALATTRIBUTENAMESTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final RuleCall cLEFTBRACKETTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final Assignment cAttributeNamesAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cAttributeNamesAttributeNameParserRuleCall_9_0 = (RuleCall)cAttributeNamesAssignment_9.eContents().get(0);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final RuleCall cCOMATerminalRuleCall_10_0 = (RuleCall)cGroup_10.eContents().get(0);
		private final Assignment cAttributeNamesAssignment_10_1 = (Assignment)cGroup_10.eContents().get(1);
		private final RuleCall cAttributeNamesAttributeNameParserRuleCall_10_1_0 = (RuleCall)cAttributeNamesAssignment_10_1.eContents().get(0);
		private final RuleCall cRIGHTBRACKETTerminalRuleCall_11 = (RuleCall)cGroup.eContents().get(11);
		private final RuleCall cRIGHTPARENTESISTerminalRuleCall_12 = (RuleCall)cGroup.eContents().get(12);
		
		//MergedField:
		//	LEFTPARENTESIS (LITERALTABLENAME tableName=EString)? LITERALFIELDS LEFTBRACKET fields+=Field (COMA fields+=Field)*
		//	RIGHTBRACKET LITERALATTRIBUTENAMES LEFTBRACKET attributeNames+=AttributeName (COMA attributeNames+=AttributeName)*
		//	RIGHTBRACKET RIGHTPARENTESIS;
		public ParserRule getRule() { return rule; }

		//LEFTPARENTESIS (LITERALTABLENAME tableName=EString)? LITERALFIELDS LEFTBRACKET fields+=Field (COMA fields+=Field)*
		//RIGHTBRACKET LITERALATTRIBUTENAMES LEFTBRACKET attributeNames+=AttributeName (COMA attributeNames+=AttributeName)*
		//RIGHTBRACKET RIGHTPARENTESIS
		public Group getGroup() { return cGroup; }

		//LEFTPARENTESIS
		public RuleCall getLEFTPARENTESISTerminalRuleCall_0() { return cLEFTPARENTESISTerminalRuleCall_0; }

		//(LITERALTABLENAME tableName=EString)?
		public Group getGroup_1() { return cGroup_1; }

		//LITERALTABLENAME
		public RuleCall getLITERALTABLENAMETerminalRuleCall_1_0() { return cLITERALTABLENAMETerminalRuleCall_1_0; }

		//tableName=EString
		public Assignment getTableNameAssignment_1_1() { return cTableNameAssignment_1_1; }

		//EString
		public RuleCall getTableNameEStringParserRuleCall_1_1_0() { return cTableNameEStringParserRuleCall_1_1_0; }

		//LITERALFIELDS
		public RuleCall getLITERALFIELDSTerminalRuleCall_2() { return cLITERALFIELDSTerminalRuleCall_2; }

		//LEFTBRACKET
		public RuleCall getLEFTBRACKETTerminalRuleCall_3() { return cLEFTBRACKETTerminalRuleCall_3; }

		//fields+=Field
		public Assignment getFieldsAssignment_4() { return cFieldsAssignment_4; }

		//Field
		public RuleCall getFieldsFieldParserRuleCall_4_0() { return cFieldsFieldParserRuleCall_4_0; }

		//(COMA fields+=Field)*
		public Group getGroup_5() { return cGroup_5; }

		//COMA
		public RuleCall getCOMATerminalRuleCall_5_0() { return cCOMATerminalRuleCall_5_0; }

		//fields+=Field
		public Assignment getFieldsAssignment_5_1() { return cFieldsAssignment_5_1; }

		//Field
		public RuleCall getFieldsFieldParserRuleCall_5_1_0() { return cFieldsFieldParserRuleCall_5_1_0; }

		//RIGHTBRACKET
		public RuleCall getRIGHTBRACKETTerminalRuleCall_6() { return cRIGHTBRACKETTerminalRuleCall_6; }

		//LITERALATTRIBUTENAMES
		public RuleCall getLITERALATTRIBUTENAMESTerminalRuleCall_7() { return cLITERALATTRIBUTENAMESTerminalRuleCall_7; }

		//LEFTBRACKET
		public RuleCall getLEFTBRACKETTerminalRuleCall_8() { return cLEFTBRACKETTerminalRuleCall_8; }

		//attributeNames+=AttributeName
		public Assignment getAttributeNamesAssignment_9() { return cAttributeNamesAssignment_9; }

		//AttributeName
		public RuleCall getAttributeNamesAttributeNameParserRuleCall_9_0() { return cAttributeNamesAttributeNameParserRuleCall_9_0; }

		//(COMA attributeNames+=AttributeName)*
		public Group getGroup_10() { return cGroup_10; }

		//COMA
		public RuleCall getCOMATerminalRuleCall_10_0() { return cCOMATerminalRuleCall_10_0; }

		//attributeNames+=AttributeName
		public Assignment getAttributeNamesAssignment_10_1() { return cAttributeNamesAssignment_10_1; }

		//AttributeName
		public RuleCall getAttributeNamesAttributeNameParserRuleCall_10_1_0() { return cAttributeNamesAttributeNameParserRuleCall_10_1_0; }

		//RIGHTBRACKET
		public RuleCall getRIGHTBRACKETTerminalRuleCall_11() { return cRIGHTBRACKETTerminalRuleCall_11; }

		//RIGHTPARENTESIS
		public RuleCall getRIGHTPARENTESISTerminalRuleCall_12() { return cRIGHTPARENTESISTerminalRuleCall_12; }
	}

	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//	STRING | ID;
		public ParserRule getRule() { return rule; }

		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}

	public class AttributeNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AttributeName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLEFTPARENTESISTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cOldFieldAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOldFieldEStringParserRuleCall_1_0 = (RuleCall)cOldFieldAssignment_1.eContents().get(0);
		private final RuleCall cCOMATerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cFinalFieldAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cFinalFieldFieldCrossReference_3_0 = (CrossReference)cFinalFieldAssignment_3.eContents().get(0);
		private final RuleCall cFinalFieldFieldEStringParserRuleCall_3_0_1 = (RuleCall)cFinalFieldFieldCrossReference_3_0.eContents().get(1);
		private final RuleCall cRIGHTPARENTESISTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//AttributeName:
		//	LEFTPARENTESIS oldField=EString? COMA finalField=[Field|EString] RIGHTPARENTESIS;
		public ParserRule getRule() { return rule; }

		//LEFTPARENTESIS oldField=EString? COMA finalField=[Field|EString] RIGHTPARENTESIS
		public Group getGroup() { return cGroup; }

		//LEFTPARENTESIS
		public RuleCall getLEFTPARENTESISTerminalRuleCall_0() { return cLEFTPARENTESISTerminalRuleCall_0; }

		//oldField=EString?
		public Assignment getOldFieldAssignment_1() { return cOldFieldAssignment_1; }

		//EString
		public RuleCall getOldFieldEStringParserRuleCall_1_0() { return cOldFieldEStringParserRuleCall_1_0; }

		//COMA
		public RuleCall getCOMATerminalRuleCall_2() { return cCOMATerminalRuleCall_2; }

		//finalField=[Field|EString]
		public Assignment getFinalFieldAssignment_3() { return cFinalFieldAssignment_3; }

		//[Field|EString]
		public CrossReference getFinalFieldFieldCrossReference_3_0() { return cFinalFieldFieldCrossReference_3_0; }

		//EString
		public RuleCall getFinalFieldFieldEStringParserRuleCall_3_0_1() { return cFinalFieldFieldEStringParserRuleCall_3_0_1; }

		//RIGHTPARENTESIS
		public RuleCall getRIGHTPARENTESISTerminalRuleCall_4() { return cRIGHTPARENTESISTerminalRuleCall_4; }
	}

	public class FieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Field");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLEFTPARENTESISTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cCOMATerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeFieldTypeEnumRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		private final RuleCall cRIGHTPARENTESISTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//Field:
		//	LEFTPARENTESIS name=EString COMA type=FieldType? RIGHTPARENTESIS;
		public ParserRule getRule() { return rule; }

		//LEFTPARENTESIS name=EString COMA type=FieldType? RIGHTPARENTESIS
		public Group getGroup() { return cGroup; }

		//LEFTPARENTESIS
		public RuleCall getLEFTPARENTESISTerminalRuleCall_0() { return cLEFTPARENTESISTerminalRuleCall_0; }

		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }

		//COMA
		public RuleCall getCOMATerminalRuleCall_2() { return cCOMATerminalRuleCall_2; }

		//type=FieldType?
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }

		//FieldType
		public RuleCall getTypeFieldTypeEnumRuleCall_3_0() { return cTypeFieldTypeEnumRuleCall_3_0; }

		//RIGHTPARENTESIS
		public RuleCall getRIGHTPARENTESISTerminalRuleCall_4() { return cRIGHTPARENTESISTerminalRuleCall_4; }
	}
	
	
	public class FieldTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "FieldType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cStringEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cStringStringKeyword_0_0 = (Keyword)cStringEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cIntegerEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cIntegerIntegerKeyword_1_0 = (Keyword)cIntegerEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cFloatEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cFloatFloatKeyword_2_0 = (Keyword)cFloatEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cBooleanEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cBooleanBooleanKeyword_3_0 = (Keyword)cBooleanEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum FieldType:
		//	String="\'String\'" | Integer="\'Integer\'" | Float="\'Float\'" | Boolean="\'Boolean\'";
		public EnumRule getRule() { return rule; }

		//String="\'String\'" | Integer="\'Integer\'" | Float="\'Float\'" | Boolean="\'Boolean\'"
		public Alternatives getAlternatives() { return cAlternatives; }

		//String="\'String\'"
		public EnumLiteralDeclaration getStringEnumLiteralDeclaration_0() { return cStringEnumLiteralDeclaration_0; }

		//"\'String\'"
		public Keyword getStringStringKeyword_0_0() { return cStringStringKeyword_0_0; }

		//Integer="\'Integer\'"
		public EnumLiteralDeclaration getIntegerEnumLiteralDeclaration_1() { return cIntegerEnumLiteralDeclaration_1; }

		//"\'Integer\'"
		public Keyword getIntegerIntegerKeyword_1_0() { return cIntegerIntegerKeyword_1_0; }

		//Float="\'Float\'"
		public EnumLiteralDeclaration getFloatEnumLiteralDeclaration_2() { return cFloatEnumLiteralDeclaration_2; }

		//"\'Float\'"
		public Keyword getFloatFloatKeyword_2_0() { return cFloatFloatKeyword_2_0; }

		//Boolean="\'Boolean\'"
		public EnumLiteralDeclaration getBooleanEnumLiteralDeclaration_3() { return cBooleanEnumLiteralDeclaration_3; }

		//"\'Boolean\'"
		public Keyword getBooleanBooleanKeyword_3_0() { return cBooleanBooleanKeyword_3_0; }
	}
	
	private final ConfigElements pConfig;
	private final ConnectionElements pConnection;
	private final MergedFieldElements pMergedField;
	private final EStringElements pEString;
	private final AttributeNameElements pAttributeName;
	private final FieldElements pField;
	private final FieldTypeElements unknownRuleFieldType;
	private final TerminalRule tLITERACONFIG;
	private final TerminalRule tLITERACONNECTION;
	private final TerminalRule tLITERALMERGEDFIELDS;
	private final TerminalRule tLITERALTABLENAME;
	private final TerminalRule tLITERALFIELDS;
	private final TerminalRule tLITERALATTRIBUTENAMES;
	private final TerminalRule tLITERALURL;
	private final TerminalRule tLITERALUSERNAME;
	private final TerminalRule tLITERALPASSWORD;
	private final TerminalRule tCOLON;
	private final TerminalRule tCOMA;
	private final TerminalRule tLEFTPARENTESIS;
	private final TerminalRule tLEFTBRACKET;
	private final TerminalRule tRIGHTBRACKET;
	private final TerminalRule tRIGHTPARENTESIS;
	private final TerminalRule tSINGLEQUOTE;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public GrammarGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pConfig = new ConfigElements();
		this.pConnection = new ConnectionElements();
		this.pMergedField = new MergedFieldElements();
		this.pEString = new EStringElements();
		this.pAttributeName = new AttributeNameElements();
		this.pField = new FieldElements();
		this.unknownRuleFieldType = new FieldTypeElements();
		this.tLITERACONFIG = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LITERACONFIG");
		this.tLITERACONNECTION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LITERACONNECTION");
		this.tLITERALMERGEDFIELDS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LITERALMERGEDFIELDS");
		this.tLITERALTABLENAME = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LITERALTABLENAME");
		this.tLITERALFIELDS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LITERALFIELDS");
		this.tLITERALATTRIBUTENAMES = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LITERALATTRIBUTENAMES");
		this.tLITERALURL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LITERALURL");
		this.tLITERALUSERNAME = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LITERALUSERNAME");
		this.tLITERALPASSWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LITERALPASSWORD");
		this.tCOLON = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "COLON");
		this.tCOMA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "COMA");
		this.tLEFTPARENTESIS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LEFTPARENTESIS");
		this.tLEFTBRACKET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LEFTBRACKET");
		this.tRIGHTBRACKET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "RIGHTBRACKET");
		this.tRIGHTPARENTESIS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "RIGHTPARENTESIS");
		this.tSINGLEQUOTE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SINGLEQUOTE");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("co.edu.uniandes.jsonToSql.Grammar".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Config:
	//	LITERACONFIG COLON LEFTPARENTESIS LITERACONNECTION COLON conecction=Connection (LITERALMERGEDFIELDS LEFTBRACKET
	//	mergeFields+=MergedField (COMA mergeFields+=MergedField)* RIGHTBRACKET)? RIGHTPARENTESIS;
	public ConfigElements getConfigAccess() {
		return pConfig;
	}
	
	public ParserRule getConfigRule() {
		return getConfigAccess().getRule();
	}

	//Connection:
	//	{Connection} LEFTPARENTESIS (LITERALURL url=EString)? (LITERALUSERNAME username=EString)? (LITERALPASSWORD
	//	password=EString)? RIGHTPARENTESIS;
	public ConnectionElements getConnectionAccess() {
		return pConnection;
	}
	
	public ParserRule getConnectionRule() {
		return getConnectionAccess().getRule();
	}

	//MergedField:
	//	LEFTPARENTESIS (LITERALTABLENAME tableName=EString)? LITERALFIELDS LEFTBRACKET fields+=Field (COMA fields+=Field)*
	//	RIGHTBRACKET LITERALATTRIBUTENAMES LEFTBRACKET attributeNames+=AttributeName (COMA attributeNames+=AttributeName)*
	//	RIGHTBRACKET RIGHTPARENTESIS;
	public MergedFieldElements getMergedFieldAccess() {
		return pMergedField;
	}
	
	public ParserRule getMergedFieldRule() {
		return getMergedFieldAccess().getRule();
	}

	//EString returns ecore::EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//AttributeName:
	//	LEFTPARENTESIS oldField=EString? COMA finalField=[Field|EString] RIGHTPARENTESIS;
	public AttributeNameElements getAttributeNameAccess() {
		return pAttributeName;
	}
	
	public ParserRule getAttributeNameRule() {
		return getAttributeNameAccess().getRule();
	}

	//Field:
	//	LEFTPARENTESIS name=EString COMA type=FieldType? RIGHTPARENTESIS;
	public FieldElements getFieldAccess() {
		return pField;
	}
	
	public ParserRule getFieldRule() {
		return getFieldAccess().getRule();
	}

	//enum FieldType:
	//	String="\'String\'" | Integer="\'Integer\'" | Float="\'Float\'" | Boolean="\'Boolean\'";
	public FieldTypeElements getFieldTypeAccess() {
		return unknownRuleFieldType;
	}
	
	public EnumRule getFieldTypeRule() {
		return getFieldTypeAccess().getRule();
	}

	//terminal LITERACONFIG:
	//	"\'config\'";
	public TerminalRule getLITERACONFIGRule() {
		return tLITERACONFIG;
	} 

	//terminal LITERACONNECTION:
	//	"\'connection\'";
	public TerminalRule getLITERACONNECTIONRule() {
		return tLITERACONNECTION;
	} 

	//terminal LITERALMERGEDFIELDS:
	//	"\'mergeFields\':";
	public TerminalRule getLITERALMERGEDFIELDSRule() {
		return tLITERALMERGEDFIELDS;
	} 

	//terminal LITERALTABLENAME:
	//	"\'tableName\':";
	public TerminalRule getLITERALTABLENAMERule() {
		return tLITERALTABLENAME;
	} 

	//terminal LITERALFIELDS:
	//	"\'fields\':";
	public TerminalRule getLITERALFIELDSRule() {
		return tLITERALFIELDS;
	} 

	//terminal LITERALATTRIBUTENAMES:
	//	"\'attributeNames\':";
	public TerminalRule getLITERALATTRIBUTENAMESRule() {
		return tLITERALATTRIBUTENAMES;
	} 

	//terminal LITERALURL:
	//	"\'url\':";
	public TerminalRule getLITERALURLRule() {
		return tLITERALURL;
	} 

	//terminal LITERALUSERNAME:
	//	"\'username\':";
	public TerminalRule getLITERALUSERNAMERule() {
		return tLITERALUSERNAME;
	} 

	//terminal LITERALPASSWORD:
	//	"\'password\':";
	public TerminalRule getLITERALPASSWORDRule() {
		return tLITERALPASSWORD;
	} 

	//terminal COLON:
	//	":";
	public TerminalRule getCOLONRule() {
		return tCOLON;
	} 

	//terminal COMA:
	//	",";
	public TerminalRule getCOMARule() {
		return tCOMA;
	} 

	//terminal LEFTPARENTESIS:
	//	"{";
	public TerminalRule getLEFTPARENTESISRule() {
		return tLEFTPARENTESIS;
	} 

	//terminal LEFTBRACKET:
	//	"[";
	public TerminalRule getLEFTBRACKETRule() {
		return tLEFTBRACKET;
	} 

	//terminal RIGHTBRACKET:
	//	"]";
	public TerminalRule getRIGHTBRACKETRule() {
		return tRIGHTBRACKET;
	} 

	//terminal RIGHTPARENTESIS:
	//	"}";
	public TerminalRule getRIGHTPARENTESISRule() {
		return tRIGHTPARENTESIS;
	} 

	//terminal SINGLEQUOTE:
	//	"\'";
	public TerminalRule getSINGLEQUOTERule() {
		return tSINGLEQUOTE;
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
