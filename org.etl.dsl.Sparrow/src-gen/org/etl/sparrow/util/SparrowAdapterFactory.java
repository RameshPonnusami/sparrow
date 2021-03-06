/**
 */
package org.etl.sparrow.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.etl.sparrow.Action;
import org.etl.sparrow.Copydata;
import org.etl.sparrow.Executescript;
import org.etl.sparrow.LoadCsv;
import org.etl.sparrow.SparrowPackage;
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
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
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
      public Adapter caseExecutescript(Executescript object)
      {
        return createExecutescriptAdapter();
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
   * Creates a new adapter for an object of class '{@link org.etl.sparrow.Executescript <em>Executescript</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.etl.sparrow.Executescript
   * @generated
   */
  public Adapter createExecutescriptAdapter()
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
