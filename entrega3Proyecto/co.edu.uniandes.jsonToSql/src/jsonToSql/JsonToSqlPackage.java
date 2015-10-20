/**
 */
package jsonToSql;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jsonToSql.JsonToSqlFactory
 * @model kind="package"
 * @generated
 */
public interface JsonToSqlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jsonToSql";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/jsonToSql";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jsonToSql";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JsonToSqlPackage eINSTANCE = jsonToSql.impl.JsonToSqlPackageImpl.init();

	/**
	 * The meta object id for the '{@link jsonToSql.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonToSql.impl.ConfigImpl
	 * @see jsonToSql.impl.JsonToSqlPackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Conecction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__CONECCTION = 0;

	/**
	 * The feature id for the '<em><b>Merge Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__MERGE_FIELDS = 1;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jsonToSql.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonToSql.impl.ConnectionImpl
	 * @see jsonToSql.impl.JsonToSqlPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__URL = 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__USERNAME = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PASSWORD = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jsonToSql.impl.MergedFieldImpl <em>Merged Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonToSql.impl.MergedFieldImpl
	 * @see jsonToSql.impl.JsonToSqlPackageImpl#getMergedField()
	 * @generated
	 */
	int MERGED_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_FIELD__TABLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Attribute Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_FIELD__ATTRIBUTE_NAMES = 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_FIELD__FIELDS = 2;

	/**
	 * The number of structural features of the '<em>Merged Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_FIELD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Merged Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jsonToSql.impl.AttributeNameImpl <em>Attribute Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonToSql.impl.AttributeNameImpl
	 * @see jsonToSql.impl.JsonToSqlPackageImpl#getAttributeName()
	 * @generated
	 */
	int ATTRIBUTE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Old Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME__OLD_FIELD = 0;

	/**
	 * The feature id for the '<em><b>Final Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME__FINAL_FIELD = 1;

	/**
	 * The number of structural features of the '<em>Attribute Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jsonToSql.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonToSql.impl.FieldImpl
	 * @see jsonToSql.impl.JsonToSqlPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jsonToSql.FieldType <em>Field Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonToSql.FieldType
	 * @see jsonToSql.impl.JsonToSqlPackageImpl#getFieldType()
	 * @generated
	 */
	int FIELD_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link jsonToSql.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see jsonToSql.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the containment reference '{@link jsonToSql.Config#getConecction <em>Conecction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conecction</em>'.
	 * @see jsonToSql.Config#getConecction()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Conecction();

	/**
	 * Returns the meta object for the containment reference list '{@link jsonToSql.Config#getMergeFields <em>Merge Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Merge Fields</em>'.
	 * @see jsonToSql.Config#getMergeFields()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_MergeFields();

	/**
	 * Returns the meta object for class '{@link jsonToSql.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see jsonToSql.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link jsonToSql.Connection#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see jsonToSql.Connection#getUrl()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Url();

	/**
	 * Returns the meta object for the attribute '{@link jsonToSql.Connection#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see jsonToSql.Connection#getUsername()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Username();

	/**
	 * Returns the meta object for the attribute '{@link jsonToSql.Connection#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see jsonToSql.Connection#getPassword()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Password();

	/**
	 * Returns the meta object for class '{@link jsonToSql.MergedField <em>Merged Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merged Field</em>'.
	 * @see jsonToSql.MergedField
	 * @generated
	 */
	EClass getMergedField();

	/**
	 * Returns the meta object for the attribute '{@link jsonToSql.MergedField#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see jsonToSql.MergedField#getTableName()
	 * @see #getMergedField()
	 * @generated
	 */
	EAttribute getMergedField_TableName();

	/**
	 * Returns the meta object for the containment reference list '{@link jsonToSql.MergedField#getAttributeNames <em>Attribute Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Names</em>'.
	 * @see jsonToSql.MergedField#getAttributeNames()
	 * @see #getMergedField()
	 * @generated
	 */
	EReference getMergedField_AttributeNames();

	/**
	 * Returns the meta object for the containment reference list '{@link jsonToSql.MergedField#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see jsonToSql.MergedField#getFields()
	 * @see #getMergedField()
	 * @generated
	 */
	EReference getMergedField_Fields();

	/**
	 * Returns the meta object for class '{@link jsonToSql.AttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Name</em>'.
	 * @see jsonToSql.AttributeName
	 * @generated
	 */
	EClass getAttributeName();

	/**
	 * Returns the meta object for the attribute '{@link jsonToSql.AttributeName#getOldField <em>Old Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Field</em>'.
	 * @see jsonToSql.AttributeName#getOldField()
	 * @see #getAttributeName()
	 * @generated
	 */
	EAttribute getAttributeName_OldField();

	/**
	 * Returns the meta object for the reference '{@link jsonToSql.AttributeName#getFinalField <em>Final Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Final Field</em>'.
	 * @see jsonToSql.AttributeName#getFinalField()
	 * @see #getAttributeName()
	 * @generated
	 */
	EReference getAttributeName_FinalField();

	/**
	 * Returns the meta object for class '{@link jsonToSql.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see jsonToSql.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link jsonToSql.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jsonToSql.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the attribute '{@link jsonToSql.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see jsonToSql.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Type();

	/**
	 * Returns the meta object for enum '{@link jsonToSql.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Field Type</em>'.
	 * @see jsonToSql.FieldType
	 * @generated
	 */
	EEnum getFieldType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JsonToSqlFactory getJsonToSqlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jsonToSql.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonToSql.impl.ConfigImpl
		 * @see jsonToSql.impl.JsonToSqlPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '<em><b>Conecction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__CONECCTION = eINSTANCE.getConfig_Conecction();

		/**
		 * The meta object literal for the '<em><b>Merge Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__MERGE_FIELDS = eINSTANCE.getConfig_MergeFields();

		/**
		 * The meta object literal for the '{@link jsonToSql.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonToSql.impl.ConnectionImpl
		 * @see jsonToSql.impl.JsonToSqlPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__URL = eINSTANCE.getConnection_Url();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__USERNAME = eINSTANCE.getConnection_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__PASSWORD = eINSTANCE.getConnection_Password();

		/**
		 * The meta object literal for the '{@link jsonToSql.impl.MergedFieldImpl <em>Merged Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonToSql.impl.MergedFieldImpl
		 * @see jsonToSql.impl.JsonToSqlPackageImpl#getMergedField()
		 * @generated
		 */
		EClass MERGED_FIELD = eINSTANCE.getMergedField();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGED_FIELD__TABLE_NAME = eINSTANCE.getMergedField_TableName();

		/**
		 * The meta object literal for the '<em><b>Attribute Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_FIELD__ATTRIBUTE_NAMES = eINSTANCE.getMergedField_AttributeNames();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_FIELD__FIELDS = eINSTANCE.getMergedField_Fields();

		/**
		 * The meta object literal for the '{@link jsonToSql.impl.AttributeNameImpl <em>Attribute Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonToSql.impl.AttributeNameImpl
		 * @see jsonToSql.impl.JsonToSqlPackageImpl#getAttributeName()
		 * @generated
		 */
		EClass ATTRIBUTE_NAME = eINSTANCE.getAttributeName();

		/**
		 * The meta object literal for the '<em><b>Old Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_NAME__OLD_FIELD = eINSTANCE.getAttributeName_OldField();

		/**
		 * The meta object literal for the '<em><b>Final Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_NAME__FINAL_FIELD = eINSTANCE.getAttributeName_FinalField();

		/**
		 * The meta object literal for the '{@link jsonToSql.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonToSql.impl.FieldImpl
		 * @see jsonToSql.impl.JsonToSqlPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '{@link jsonToSql.FieldType <em>Field Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonToSql.FieldType
		 * @see jsonToSql.impl.JsonToSqlPackageImpl#getFieldType()
		 * @generated
		 */
		EEnum FIELD_TYPE = eINSTANCE.getFieldType();

	}

} //JsonToSqlPackage
