package co.edu.uniandes.jsonToSql.serializer;

import co.edu.uniandes.jsonToSql.services.GrammarGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import jsonToSql.AttributeName;
import jsonToSql.Config;
import jsonToSql.Connection;
import jsonToSql.Field;
import jsonToSql.JsonToSqlPackage;
import jsonToSql.MergedField;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public abstract class AbstractGrammarSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GrammarGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == JsonToSqlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JsonToSqlPackage.ATTRIBUTE_NAME:
				if(context == grammarAccess.getAttributeNameRule()) {
					sequence_AttributeName(context, (AttributeName) semanticObject); 
					return; 
				}
				else break;
			case JsonToSqlPackage.CONFIG:
				if(context == grammarAccess.getConfigRule()) {
					sequence_Config(context, (Config) semanticObject); 
					return; 
				}
				else break;
			case JsonToSqlPackage.CONNECTION:
				if(context == grammarAccess.getConnectionRule()) {
					sequence_Connection(context, (Connection) semanticObject); 
					return; 
				}
				else break;
			case JsonToSqlPackage.FIELD:
				if(context == grammarAccess.getFieldRule()) {
					sequence_Field(context, (Field) semanticObject); 
					return; 
				}
				else break;
			case JsonToSqlPackage.MERGED_FIELD:
				if(context == grammarAccess.getMergedFieldRule()) {
					sequence_MergedField(context, (MergedField) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (oldField=EString? finalField=[Field|EString])
	 */
	protected void sequence_AttributeName(EObject context, AttributeName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (conecction=Connection (mergeFields+=MergedField mergeFields+=MergedField*)?)
	 */
	protected void sequence_Config(EObject context, Config semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (url=EString? username=EString? password=EString?)
	 */
	protected void sequence_Connection(EObject context, Connection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString type=FieldType?)
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tableName=EString? attributeNames+=AttributeName attributeNames+=AttributeName* fields+=Field fields+=Field*)
	 */
	protected void sequence_MergedField(EObject context, MergedField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
