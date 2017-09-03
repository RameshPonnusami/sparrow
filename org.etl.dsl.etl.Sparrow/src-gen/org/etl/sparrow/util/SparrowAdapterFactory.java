/**
 * generated by Xtext 2.12.0
 */
package org.etl.sparrow.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.etl.sparrow.Action;
import org.etl.sparrow.Callprocess;
import org.etl.sparrow.Catch;
import org.etl.sparrow.Copydata;
import org.etl.sparrow.Finally;
import org.etl.sparrow.Googlecal;
import org.etl.sparrow.LoadCsv;
import org.etl.sparrow.Slack;
import org.etl.sparrow.Sms;
import org.etl.sparrow.SparrowPackage;
import org.etl.sparrow.Transform;
import org.etl.sparrow.Try;
import org.etl.sparrow.Updatedaudit;
import org.etl.sparrow.WriteCsv;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.etl.sparrow.SparrowPackage
 * @generated
 */
public class SparrowAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SparrowPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparrowAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SparrowPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SparrowSwitch<Adapter> modelSwitch =
    new SparrowSwitch<Adapter>()
    {
      @Override
      public Adapter caseProcess(org.etl.sparrow.Process object)
      {
        return createProcessAdapter();
      }
      @Override
      public Adapter caseTry(Try object)
      {
        return createTryAdapter();
      }
      @Override
      public Adapter caseFinally(Finally object)
      {
        return createFinallyAdapter();
      }
      @Override
      public Adapter caseCatch(Catch object)
      {
        return createCatchAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseCallprocess(Callprocess object)
      {
        return createCallprocessAdapter();
      }
      @Override
      public Adapter caseUpdatedaudit(Updatedaudit object)
      {
        return createUpdatedauditAdapter();
      }
      @Override
      public Adapter caseSms(Sms object)
      {
        return createSmsAdapter();
      }
      @Override
      public Adapter caseSlack(Slack object)
      {
        return createSlackAdapter();
      }
      @Override
      public Adapter caseGooglecal(Googlecal object)
      {
        return createGooglecalAdapter();
      }
      @Override
      public Adapter caseCopydata(Copydata object)
      {
        return createCopydataAdapter();
      }
      @Override
      public Adapter caseWriteCsv(WriteCsv object)
      {
        return createWriteCsvAdapter();
      }
      @Override
      public Adapter caseLoadCsv(LoadCsv object)
      {
        return createLoadCsvAdapter();
      }
      @Override
      public Adapter caseTransform(Transform object)
      {
        return createTransformAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.etl.sparrow.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.etl.sparrow.Process
   * @generated
   */
  public Adapter createProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.etl.sparrow.Try <em>Try</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.etl.sparrow.Try
   * @generated
   */
  public Adapter createTryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.etl.sparrow.Finally <em>Finally</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.etl.sparrow.Finally
   * @generated
   */
  public Adapter createFinallyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.etl.sparrow.Catch <em>Catch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.etl.sparrow.Catch
   * @generated
   */
  public Adapter createCatchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.etl.sparrow.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.etl.sparrow.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.etl.sparrow.Callprocess <em>Callprocess</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.etl.sparrow.Callprocess
   * @generated
   */
  public Adapter createCallprocessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.etl.sparrow.Updatedaudit <em>Updatedaudit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.etl.sparrow.Updatedaudit
   * @generated
   */
  public Adapter createUpdatedauditAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.etl.sparrow.Sms <em>Sms</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.etl.sparrow.Sms
   * @generated
   */
  public Adapter createSmsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.etl.sparrow.Slack <em>Slack</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.etl.sparrow.Slack
   * @generated
   */
  public Adapter createSlackAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.etl.sparrow.Googlecal <em>Googlecal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.etl.sparrow.Googlecal
   * @generated
   */
  public Adapter createGooglecalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.etl.sparrow.Copydata <em>Copydata</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.etl.sparrow.Copydata
   * @generated
   */
  public Adapter createCopydataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.etl.sparrow.WriteCsv <em>Write Csv</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.etl.sparrow.WriteCsv
   * @generated
   */
  public Adapter createWriteCsvAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.etl.sparrow.LoadCsv <em>Load Csv</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.etl.sparrow.LoadCsv
   * @generated
   */
  public Adapter createLoadCsvAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.etl.sparrow.Transform <em>Transform</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.etl.sparrow.Transform
   * @generated
   */
  public Adapter createTransformAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SparrowAdapterFactory
