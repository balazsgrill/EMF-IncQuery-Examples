package hu.bme.mit.incquery.ecorequeries.example.samplequery2;

import java.util.Arrays;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the SampleQuery2 pattern, 
 * to be used in conjunction with SampleQuery2Matcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SampleQuery2Matcher
 * @see SampleQuery2Processor
 * 
 */
public final class SampleQuery2Match extends BasePatternMatch implements IPatternMatch {
  private EClass fXElement;
  
  private EClass fYElement;
  
  private EStructuralFeature fRelates1;
  
  private EReference fRelates2;
  
  private Object fLabel1;
  
  private Object fLabel2;
  
  private static String[] parameterNames = {"XElement", "YElement", "Relates1", "Relates2", "Label1", "Label2"};
  
  SampleQuery2Match(final EClass pXElement, final EClass pYElement, final EStructuralFeature pRelates1, final EReference pRelates2, final Object pLabel1, final Object pLabel2) {
    this.fXElement = pXElement;
    this.fYElement = pYElement;
    this.fRelates1 = pRelates1;
    this.fRelates2 = pRelates2;
    this.fLabel1 = pLabel1;
    this.fLabel2 = pLabel2;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("XElement".equals(parameterName)) return this.fXElement;
    if ("YElement".equals(parameterName)) return this.fYElement;
    if ("Relates1".equals(parameterName)) return this.fRelates1;
    if ("Relates2".equals(parameterName)) return this.fRelates2;
    if ("Label1".equals(parameterName)) return this.fLabel1;
    if ("Label2".equals(parameterName)) return this.fLabel2;
    return null;
    
  }
  
  public EClass getXElement() {
    return this.fXElement;
    
  }
  
  public EClass getYElement() {
    return this.fYElement;
    
  }
  
  public EStructuralFeature getRelates1() {
    return this.fRelates1;
    
  }
  
  public EReference getRelates2() {
    return this.fRelates2;
    
  }
  
  public Object getLabel1() {
    return this.fLabel1;
    
  }
  
  public Object getLabel2() {
    return this.fLabel2;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("XElement".equals(parameterName) && newValue instanceof org.eclipse.emf.ecore.EClass) {
    	this.fXElement = (org.eclipse.emf.ecore.EClass) newValue;
    	return true;
    }
    if ("YElement".equals(parameterName) && newValue instanceof org.eclipse.emf.ecore.EClass) {
    	this.fYElement = (org.eclipse.emf.ecore.EClass) newValue;
    	return true;
    }
    if ("Relates1".equals(parameterName) && newValue instanceof org.eclipse.emf.ecore.EStructuralFeature) {
    	this.fRelates1 = (org.eclipse.emf.ecore.EStructuralFeature) newValue;
    	return true;
    }
    if ("Relates2".equals(parameterName) && newValue instanceof org.eclipse.emf.ecore.EReference) {
    	this.fRelates2 = (org.eclipse.emf.ecore.EReference) newValue;
    	return true;
    }
    if ("Label1".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fLabel1 = (java.lang.Object) newValue;
    	return true;
    }
    if ("Label2".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fLabel2 = (java.lang.Object) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setXElement(final EClass pXElement) {
    this.fXElement = pXElement;
    
  }
  
  public void setYElement(final EClass pYElement) {
    this.fYElement = pYElement;
    
  }
  
  public void setRelates1(final EStructuralFeature pRelates1) {
    this.fRelates1 = pRelates1;
    
  }
  
  public void setRelates2(final EReference pRelates2) {
    this.fRelates2 = pRelates2;
    
  }
  
  public void setLabel1(final Object pLabel1) {
    this.fLabel1 = pLabel1;
    
  }
  
  public void setLabel2(final Object pLabel2) {
    this.fLabel2 = pLabel2;
    
  }
  
  @Override
  public String patternName() {
    return "SampleQuery2";
    
  }
  
  @Override
  public String[] parameterNames() {
    return SampleQuery2Match.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fXElement, fYElement, fRelates1, fRelates2, fLabel1, fLabel2};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"XElement\"=" + prettyPrintValue(fXElement) + ", ");
    result.append("\"YElement\"=" + prettyPrintValue(fYElement) + ", ");
    result.append("\"Relates1\"=" + prettyPrintValue(fRelates1) + ", ");
    result.append("\"Relates2\"=" + prettyPrintValue(fRelates2) + ", ");
    result.append("\"Label1\"=" + prettyPrintValue(fLabel1) + ", ");
    result.append("\"Label2\"=" + prettyPrintValue(fLabel2));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fXElement == null) ? 0 : fXElement.hashCode()); 
    result = prime * result + ((fYElement == null) ? 0 : fYElement.hashCode()); 
    result = prime * result + ((fRelates1 == null) ? 0 : fRelates1.hashCode()); 
    result = prime * result + ((fRelates2 == null) ? 0 : fRelates2.hashCode()); 
    result = prime * result + ((fLabel1 == null) ? 0 : fLabel1.hashCode()); 
    result = prime * result + ((fLabel2 == null) ? 0 : fLabel2.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (obj == null)
    	return false;
    if (!(obj instanceof IPatternMatch))
    	return false;
    IPatternMatch otherSig  = (IPatternMatch) obj;
    if (!pattern().equals(otherSig.pattern()))
    	return false;
    if (!SampleQuery2Match.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    SampleQuery2Match other = (SampleQuery2Match) obj;
    if (fXElement == null) {if (other.fXElement != null) return false;}
    else if (!fXElement.equals(other.fXElement)) return false;
    if (fYElement == null) {if (other.fYElement != null) return false;}
    else if (!fYElement.equals(other.fYElement)) return false;
    if (fRelates1 == null) {if (other.fRelates1 != null) return false;}
    else if (!fRelates1.equals(other.fRelates1)) return false;
    if (fRelates2 == null) {if (other.fRelates2 != null) return false;}
    else if (!fRelates2.equals(other.fRelates2)) return false;
    if (fLabel1 == null) {if (other.fLabel1 != null) return false;}
    else if (!fLabel1.equals(other.fLabel1)) return false;
    if (fLabel2 == null) {if (other.fLabel2 != null) return false;}
    else if (!fLabel2.equals(other.fLabel2)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return SampleQuery2Matcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}