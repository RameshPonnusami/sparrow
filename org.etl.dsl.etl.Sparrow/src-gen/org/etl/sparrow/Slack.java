/**
 * generated by Xtext 2.12.0
 */
package org.etl.sparrow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.etl.sparrow.Slack#getTeam <em>Team</em>}</li>
 *   <li>{@link org.etl.sparrow.Slack#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.etl.sparrow.Slack#getValue <em>Value</em>}</li>
 *   <li>{@link org.etl.sparrow.Slack#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.etl.sparrow.SparrowPackage#getSlack()
 * @model
 * @generated
 */
public interface Slack extends Action
{
  /**
   * Returns the value of the '<em><b>Team</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Team</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Team</em>' attribute.
   * @see #setTeam(String)
   * @see org.etl.sparrow.SparrowPackage#getSlack_Team()
   * @model
   * @generated
   */
  String getTeam();

  /**
   * Sets the value of the '{@link org.etl.sparrow.Slack#getTeam <em>Team</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Team</em>' attribute.
   * @see #getTeam()
   * @generated
   */
  void setTeam(String value);

  /**
   * Returns the value of the '<em><b>Channel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Channel</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Channel</em>' attribute.
   * @see #setChannel(String)
   * @see org.etl.sparrow.SparrowPackage#getSlack_Channel()
   * @model
   * @generated
   */
  String getChannel();

  /**
   * Sets the value of the '{@link org.etl.sparrow.Slack#getChannel <em>Channel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Channel</em>' attribute.
   * @see #getChannel()
   * @generated
   */
  void setChannel(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.etl.sparrow.SparrowPackage#getSlack_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.etl.sparrow.Slack#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' attribute.
   * @see #setCondition(String)
   * @see org.etl.sparrow.SparrowPackage#getSlack_Condition()
   * @model
   * @generated
   */
  String getCondition();

  /**
   * Sets the value of the '{@link org.etl.sparrow.Slack#getCondition <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' attribute.
   * @see #getCondition()
   * @generated
   */
  void setCondition(String value);

} // Slack
