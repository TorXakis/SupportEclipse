/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Func Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.FuncDef#getFuncName <em>Func Name</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.FuncDef#getNeVarsDelarationList <em>Ne Vars Delaration List</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.FuncDef#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.FuncDef#getValExpr <em>Val Expr</em>}</li>
 * </ul>
 *
 * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getFuncDef()
 * @model
 * @generated
 */
public interface FuncDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Func Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func Name</em>' containment reference.
   * @see #setFuncName(FuncName)
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getFuncDef_FuncName()
   * @model containment="true"
   * @generated
   */
  FuncName getFuncName();

  /**
   * Sets the value of the '{@link nl.tno.torxakis.language.torXakisDsl.FuncDef#getFuncName <em>Func Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func Name</em>' containment reference.
   * @see #getFuncName()
   * @generated
   */
  void setFuncName(FuncName value);

  /**
   * Returns the value of the '<em><b>Ne Vars Delaration List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ne Vars Delaration List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ne Vars Delaration List</em>' containment reference.
   * @see #setNeVarsDelarationList(NeVarsDeclarationList)
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getFuncDef_NeVarsDelarationList()
   * @model containment="true"
   * @generated
   */
  NeVarsDeclarationList getNeVarsDelarationList();

  /**
   * Sets the value of the '{@link nl.tno.torxakis.language.torXakisDsl.FuncDef#getNeVarsDelarationList <em>Ne Vars Delaration List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ne Vars Delaration List</em>' containment reference.
   * @see #getNeVarsDelarationList()
   * @generated
   */
  void setNeVarsDelarationList(NeVarsDeclarationList value);

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
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getFuncDef_TypeName()
   * @model containment="true"
   * @generated
   */
  TypeName getTypeName();

  /**
   * Sets the value of the '{@link nl.tno.torxakis.language.torXakisDsl.FuncDef#getTypeName <em>Type Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' containment reference.
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(TypeName value);

  /**
   * Returns the value of the '<em><b>Val Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val Expr</em>' containment reference.
   * @see #setValExpr(ValExpr)
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getFuncDef_ValExpr()
   * @model containment="true"
   * @generated
   */
  ValExpr getValExpr();

  /**
   * Sets the value of the '{@link nl.tno.torxakis.language.torXakisDsl.FuncDef#getValExpr <em>Val Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val Expr</em>' containment reference.
   * @see #getValExpr()
   * @generated
   */
  void setValExpr(ValExpr value);

} // FuncDef