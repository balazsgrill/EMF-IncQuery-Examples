package hu.bme.mit.incquery.ecorequeries.example.isestring;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the IsEString pattern, 
 * to be used in conjunction with IsEStringMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see IsEStringMatcher
 * @see IsEStringProcessor
 * 
 */
public final class IsEStringMatch extends BasePatternMatch implements IPatternMatch {
  private Object fElement;
  
  private static String[] parameterNames = {"Element"};
  
  IsEStringMatch(final Object pElement) {
    this.fElement = pElement;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Element".equals(parameterName)) return this.fElement;
    return null;
    
  }
  
  public Object getElement() {
    return this.fElement;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("Element".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fElement = (java.lang.Object) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setElement(final Object pElement) {
    this.fElement = pElement;
    
  }
  
  @Override
  public String patternName() {
    return "IsEString";
    
  }
  
  @Override
  public String[] parameterNames() {
    return IsEStringMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fElement};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Element\"=" + prettyPrintValue(fElement));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fElement == null) ? 0 : fElement.hashCode()); 
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
    if (!IsEStringMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    IsEStringMatch other = (IsEStringMatch) obj;
    if (fElement == null) {if (other.fElement != null) return false;}
    else if (!fElement.equals(other.fElement)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return IsEStringMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}