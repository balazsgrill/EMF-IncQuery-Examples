package hu.bme.mit.incquery.ecorequeries.example.ereferencewithonemultiplicityname;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the EReferenceWithOneMultiplicityName pattern, 
 * to be used in conjunction with EReferenceWithOneMultiplicityNameMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EReferenceWithOneMultiplicityNameMatcher
 * @see EReferenceWithOneMultiplicityNameProcessor
 * 
 */
public final class EReferenceWithOneMultiplicityNameMatch extends BasePatternMatch implements IPatternMatch {
  private String fERefName;
  
  private static String[] parameterNames = {"ERefName"};
  
  EReferenceWithOneMultiplicityNameMatch(final String pERefName) {
    this.fERefName = pERefName;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("ERefName".equals(parameterName)) return this.fERefName;
    return null;
    
  }
  
  public String getERefName() {
    return this.fERefName;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("ERefName".equals(parameterName) && newValue instanceof java.lang.String) {
    	this.fERefName = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setERefName(final String pERefName) {
    this.fERefName = pERefName;
    
  }
  
  @Override
  public String patternName() {
    return "EReferenceWithOneMultiplicityName";
    
  }
  
  @Override
  public String[] parameterNames() {
    return EReferenceWithOneMultiplicityNameMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fERefName};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"ERefName\"=" + prettyPrintValue(fERefName));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fERefName == null) ? 0 : fERefName.hashCode()); 
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
    if (!EReferenceWithOneMultiplicityNameMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    EReferenceWithOneMultiplicityNameMatch other = (EReferenceWithOneMultiplicityNameMatch) obj;
    if (fERefName == null) {if (other.fERefName != null) return false;}
    else if (!fERefName.equals(other.fERefName)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return EReferenceWithOneMultiplicityNameMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}