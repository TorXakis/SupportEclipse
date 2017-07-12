/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Func Defs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.FuncDefs#getFuncDefs <em>Func Defs</em>}</li>
 * </ul>
 *
 * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getFuncDefs()
 * @model
 * @generated
 */
public interface FuncDefs extends EObject
{
  /**
   * Returns the value of the '<em><b>Func Defs</b></em>' containment reference list.
   * The list contents are of type {@link nl.tno.torxakis.language.torXakisDsl.FuncDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func Defs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func Defs</em>' containment reference list.
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getFuncDefs_FuncDefs()
   * @model containment="true"
   * @generated
   */
  EList<FuncDef> getFuncDefs();

} // FuncDefs