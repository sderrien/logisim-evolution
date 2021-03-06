/**
 */
package com.cburch.logisim.statemachine.fSMDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cburch.logisim.statemachine.fSMDSL.PortRef#getPort <em>Port</em>}</li>
 *   <li>{@link com.cburch.logisim.statemachine.fSMDSL.PortRef#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see com.cburch.logisim.statemachine.fSMDSL.FSMDSLPackage#getPortRef()
 * @model
 * @generated
 */
public interface PortRef extends BoolExpr
{
  /**
   * Returns the value of the '<em><b>Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' reference.
   * @see #setPort(Port)
   * @see com.cburch.logisim.statemachine.fSMDSL.FSMDSLPackage#getPortRef_Port()
   * @model
   * @generated
   */
  Port getPort();

  /**
   * Sets the value of the '{@link com.cburch.logisim.statemachine.fSMDSL.PortRef#getPort <em>Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' reference.
   * @see #getPort()
   * @generated
   */
  void setPort(Port value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(Range)
   * @see com.cburch.logisim.statemachine.fSMDSL.FSMDSLPackage#getPortRef_Range()
   * @model containment="true"
   * @generated
   */
  Range getRange();

  /**
   * Sets the value of the '{@link com.cburch.logisim.statemachine.fSMDSL.PortRef#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(Range value);

} // PortRef
