/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.Transition#getFromName <em>From Name</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.Transition#getConditionalCommunications <em>Conditional Communications</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.Transition#getUpdateList <em>Update List</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.Transition#getToName <em>To Name</em>}</li>
 * </ul>
 *
 * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>From Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Name</em>' containment reference.
   * @see #setFromName(IdName)
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getTransition_FromName()
   * @model containment="true"
   * @generated
   */
  IdName getFromName();

  /**
   * Sets the value of the '{@link nl.tno.torxakis.language.torXakisDsl.Transition#getFromName <em>From Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Name</em>' containment reference.
   * @see #getFromName()
   * @generated
   */
  void setFromName(IdName value);

  /**
   * Returns the value of the '<em><b>Conditional Communications</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditional Communications</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditional Communications</em>' containment reference.
   * @see #setConditionalCommunications(ConditionalCommunications)
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getTransition_ConditionalCommunications()
   * @model containment="true"
   * @generated
   */
  ConditionalCommunications getConditionalCommunications();

  /**
   * Sets the value of the '{@link nl.tno.torxakis.language.torXakisDsl.Transition#getConditionalCommunications <em>Conditional Communications</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditional Communications</em>' containment reference.
   * @see #getConditionalCommunications()
   * @generated
   */
  void setConditionalCommunications(ConditionalCommunications value);

  /**
   * Returns the value of the '<em><b>Update List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update List</em>' containment reference.
   * @see #setUpdateList(UpdateList)
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getTransition_UpdateList()
   * @model containment="true"
   * @generated
   */
  UpdateList getUpdateList();

  /**
   * Sets the value of the '{@link nl.tno.torxakis.language.torXakisDsl.Transition#getUpdateList <em>Update List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update List</em>' containment reference.
   * @see #getUpdateList()
   * @generated
   */
  void setUpdateList(UpdateList value);

  /**
   * Returns the value of the '<em><b>To Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Name</em>' containment reference.
   * @see #setToName(IdName)
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getTransition_ToName()
   * @model containment="true"
   * @generated
   */
  IdName getToName();

  /**
   * Sets the value of the '{@link nl.tno.torxakis.language.torXakisDsl.Transition#getToName <em>To Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Name</em>' containment reference.
   * @see #getToName()
   * @generated
   */
  void setToName(IdName value);

} // Transition