/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staut Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.StautItems#getStateItems <em>State Items</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.StautItems#getVarItems <em>Var Items</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.StautItems#getInitItems <em>Init Items</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.StautItems#getTransItems <em>Trans Items</em>}</li>
 * </ul>
 *
 * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getStautItems()
 * @model
 * @generated
 */
public interface StautItems extends EObject
{
  /**
   * Returns the value of the '<em><b>State Items</b></em>' containment reference list.
   * The list contents are of type {@link nl.tno.torxakis.language.torXakisDsl.StateItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Items</em>' containment reference list.
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getStautItems_StateItems()
   * @model containment="true"
   * @generated
   */
  EList<StateItem> getStateItems();

  /**
   * Returns the value of the '<em><b>Var Items</b></em>' containment reference list.
   * The list contents are of type {@link nl.tno.torxakis.language.torXakisDsl.VarItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Items</em>' containment reference list.
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getStautItems_VarItems()
   * @model containment="true"
   * @generated
   */
  EList<VarItem> getVarItems();

  /**
   * Returns the value of the '<em><b>Init Items</b></em>' containment reference list.
   * The list contents are of type {@link nl.tno.torxakis.language.torXakisDsl.InitItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Items</em>' containment reference list.
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getStautItems_InitItems()
   * @model containment="true"
   * @generated
   */
  EList<InitItem> getInitItems();

  /**
   * Returns the value of the '<em><b>Trans Items</b></em>' containment reference list.
   * The list contents are of type {@link nl.tno.torxakis.language.torXakisDsl.TransItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trans Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trans Items</em>' containment reference list.
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getStautItems_TransItems()
   * @model containment="true"
   * @generated
   */
  EList<TransItem> getTransItems();

} // StautItems