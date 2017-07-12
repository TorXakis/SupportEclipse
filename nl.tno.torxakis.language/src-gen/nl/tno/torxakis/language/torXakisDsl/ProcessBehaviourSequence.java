/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Behaviour Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.ProcessBehaviourSequence#getConditionalCommunications <em>Conditional Communications</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.ProcessBehaviourSequence#getSub <em>Sub</em>}</li>
 * </ul>
 *
 * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getProcessBehaviourSequence()
 * @model
 * @generated
 */
public interface ProcessBehaviourSequence extends ProcessBehaviour
{
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
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getProcessBehaviourSequence_ConditionalCommunications()
   * @model containment="true"
   * @generated
   */
  ConditionalCommunications getConditionalCommunications();

  /**
   * Sets the value of the '{@link nl.tno.torxakis.language.torXakisDsl.ProcessBehaviourSequence#getConditionalCommunications <em>Conditional Communications</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditional Communications</em>' containment reference.
   * @see #getConditionalCommunications()
   * @generated
   */
  void setConditionalCommunications(ConditionalCommunications value);

  /**
   * Returns the value of the '<em><b>Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub</em>' containment reference.
   * @see #setSub(ProcessBehaviour)
   * @see nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage#getProcessBehaviourSequence_Sub()
   * @model containment="true"
   * @generated
   */
  ProcessBehaviour getSub();

  /**
   * Sets the value of the '{@link nl.tno.torxakis.language.torXakisDsl.ProcessBehaviourSequence#getSub <em>Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub</em>' containment reference.
   * @see #getSub()
   * @generated
   */
  void setSub(ProcessBehaviour value);

} // ProcessBehaviourSequence