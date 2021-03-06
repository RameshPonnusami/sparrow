/**
 */
package org.etl.sparrow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.etl.sparrow.Action;
import org.etl.sparrow.Copydata;
import org.etl.sparrow.Executescript;
import org.etl.sparrow.LoadCsv;
import org.etl.sparrow.SparrowFactory;
import org.etl.sparrow.SparrowPackage;
import org.etl.sparrow.WriteCsv;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SparrowFactoryImpl extends EFactoryImpl implements SparrowFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SparrowFactory init()
  {
    try
    {
      SparrowFactory theSparrowFactory = (SparrowFactory)EPackage.Registry.INSTANCE.getEFactory(SparrowPackage.eNS_URI);
      if (theSparrowFactory != null)
      {
        return theSparrowFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SparrowFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparrowFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SparrowPackage.PROCESS: return createProcess();
      case SparrowPackage.ACTION: return createAction();
      case SparrowPackage.COPYDATA: return createCopydata();
      case SparrowPackage.WRITE_CSV: return createWriteCsv();
      case SparrowPackage.LOAD_CSV: return createLoadCsv();
      case SparrowPackage.EXECUTESCRIPT: return createExecutescript();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.etl.sparrow.Process createProcess()
  {
    ProcessImpl process = new ProcessImpl();
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Copydata createCopydata()
  {
    CopydataImpl copydata = new CopydataImpl();
    return copydata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WriteCsv createWriteCsv()
  {
    WriteCsvImpl writeCsv = new WriteCsvImpl();
    return writeCsv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoadCsv createLoadCsv()
  {
    LoadCsvImpl loadCsv = new LoadCsvImpl();
    return loadCsv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Executescript createExecutescript()
  {
    ExecutescriptImpl executescript = new ExecutescriptImpl();
    return executescript;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparrowPackage getSparrowPackage()
  {
    return (SparrowPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SparrowPackage getPackage()
  {
    return SparrowPackage.eINSTANCE;
  }

} //SparrowFactoryImpl
