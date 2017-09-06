/**
 * generated by Xtext 2.12.0
 */
package org.etl.sparrow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.etl.sparrow.Slack;
import org.etl.sparrow.SparrowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.etl.sparrow.impl.SlackImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.SlackImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.SlackImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.etl.sparrow.impl.SlackImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlackImpl extends ActionImpl implements Slack
{
  /**
   * The default value of the '{@link #getTeam() <em>Team</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeam()
   * @generated
   * @ordered
   */
  protected static final String TEAM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTeam() <em>Team</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeam()
   * @generated
   * @ordered
   */
  protected String team = TEAM_EDEFAULT;

  /**
   * The default value of the '{@link #getChannel() <em>Channel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannel()
   * @generated
   * @ordered
   */
  protected static final String CHANNEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getChannel() <em>Channel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannel()
   * @generated
   * @ordered
   */
  protected String channel = CHANNEL_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected static final String CONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected String condition = CONDITION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SlackImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SparrowPackage.Literals.SLACK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTeam()
  {
    return team;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTeam(String newTeam)
  {
    String oldTeam = team;
    team = newTeam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.SLACK__TEAM, oldTeam, team));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getChannel()
  {
    return channel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChannel(String newChannel)
  {
    String oldChannel = channel;
    channel = newChannel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.SLACK__CHANNEL, oldChannel, channel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.SLACK__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(String newCondition)
  {
    String oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparrowPackage.SLACK__CONDITION, oldCondition, condition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SparrowPackage.SLACK__TEAM:
        return getTeam();
      case SparrowPackage.SLACK__CHANNEL:
        return getChannel();
      case SparrowPackage.SLACK__VALUE:
        return getValue();
      case SparrowPackage.SLACK__CONDITION:
        return getCondition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SparrowPackage.SLACK__TEAM:
        setTeam((String)newValue);
        return;
      case SparrowPackage.SLACK__CHANNEL:
        setChannel((String)newValue);
        return;
      case SparrowPackage.SLACK__VALUE:
        setValue((String)newValue);
        return;
      case SparrowPackage.SLACK__CONDITION:
        setCondition((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SparrowPackage.SLACK__TEAM:
        setTeam(TEAM_EDEFAULT);
        return;
      case SparrowPackage.SLACK__CHANNEL:
        setChannel(CHANNEL_EDEFAULT);
        return;
      case SparrowPackage.SLACK__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case SparrowPackage.SLACK__CONDITION:
        setCondition(CONDITION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SparrowPackage.SLACK__TEAM:
        return TEAM_EDEFAULT == null ? team != null : !TEAM_EDEFAULT.equals(team);
      case SparrowPackage.SLACK__CHANNEL:
        return CHANNEL_EDEFAULT == null ? channel != null : !CHANNEL_EDEFAULT.equals(channel);
      case SparrowPackage.SLACK__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case SparrowPackage.SLACK__CONDITION:
        return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (team: ");
    result.append(team);
    result.append(", channel: ");
    result.append(channel);
    result.append(", value: ");
    result.append(value);
    result.append(", condition: ");
    result.append(condition);
    result.append(')');
    return result.toString();
  }

} //SlackImpl
