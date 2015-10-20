/**
 */
package jsonToSql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merged Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jsonToSql.MergedField#getTableName <em>Table Name</em>}</li>
 *   <li>{@link jsonToSql.MergedField#getAttributeNames <em>Attribute Names</em>}</li>
 *   <li>{@link jsonToSql.MergedField#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see jsonToSql.JsonToSqlPackage#getMergedField()
 * @model
 * @generated
 */
public interface MergedField extends EObject {
	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see jsonToSql.JsonToSqlPackage#getMergedField_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link jsonToSql.MergedField#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Names</b></em>' containment reference list.
	 * The list contents are of type {@link jsonToSql.AttributeName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Names</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Names</em>' containment reference list.
	 * @see jsonToSql.JsonToSqlPackage#getMergedField_AttributeNames()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AttributeName> getAttributeNames();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link jsonToSql.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see jsonToSql.JsonToSqlPackage#getMergedField_Fields()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Field> getFields();

} // MergedField
