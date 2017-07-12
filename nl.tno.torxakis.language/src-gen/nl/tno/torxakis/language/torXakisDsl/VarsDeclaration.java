/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vars Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.VarsDeclaration#getNeVarNameList <em>Ne Var Name List</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.VarsDeclaration#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getVarsDeclaration()
 * @model
 * @generated
 */
public interface VarsDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Ne Var Name List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ne Var Name List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ne Var Name List</em>' containment reference.
   * @see #setNeVarNameList(NeVarNameList)
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getVarsDeclaration_NeVarNameList()
   * @model containment="true"
   * @generated
   */
  NeVarNameList getNeVarNameList();

  /**
   * Sets the value of the '{@link nl.tno.torxakis.language.torXakisDsl.VarsDeclaration#getNeVarNameList <em>Ne Var Name List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ne Var Name List</em>' containment reference.
   * @see #getNeVarNameList()
   * @generated
   */
  void setNeVarNameList(NeVarNameList value);

  /**
   * Returns the value of the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Name</em>' containment reference.
   * @see #setTypeName(TypeName)
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getVarsDeclaration_TypeName()
   * @model containment="true"
   * @generated
   */
  TypeName getTypeName();

  /**
   * Sets the value of the '{@link nl.tno.torxakis.language.torXakisDsl.VarsDeclaration#getTypeName <em>Type Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' containment reference.
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(TypeName value);

} // VarsDeclaration