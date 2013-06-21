package school;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;
import school.TeacherWithoutClassNamesMatch;
import school.util.TeacherWithoutClassNamesQuerySpecification;

/**
 * Generated pattern matcher API of the school.teacherWithoutClassNames pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)}, 
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link TeacherWithoutClassNamesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern teacherWithoutClassNames(TNames) {
 * 	neg find classesOfTeacher(T, _SC);
 * 	Teacher.name(T, TNames);
 * }
 * </pre></code>
 * 
 * @see TeacherWithoutClassNamesMatch
 * @see TeacherWithoutClassNamesProcessor
 * @see TeacherWithoutClassNamesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class TeacherWithoutClassNamesMatcher extends BaseMatcher<TeacherWithoutClassNamesMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static TeacherWithoutClassNamesMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    TeacherWithoutClassNamesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new TeacherWithoutClassNamesMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    } 	
    return matcher;
  }
  
  private final static int POSITION_TNAMES = 0;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so 
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public TeacherWithoutClassNamesMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public TeacherWithoutClassNamesMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTNames the fixed value of pattern parameter TNames, or null if not bound.
   * @return matches represented as a TeacherWithoutClassNamesMatch object.
   * 
   */
  public Collection<TeacherWithoutClassNamesMatch> getAllMatches(final String pTNames) {
    return rawGetAllMatches(new Object[]{pTNames});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTNames the fixed value of pattern parameter TNames, or null if not bound.
   * @return a match represented as a TeacherWithoutClassNamesMatch object, or null if no match is found.
   * 
   */
  public TeacherWithoutClassNamesMatch getOneArbitraryMatch(final String pTNames) {
    return rawGetOneArbitraryMatch(new Object[]{pTNames});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTNames the fixed value of pattern parameter TNames, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pTNames) {
    return rawHasMatch(new Object[]{pTNames});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTNames the fixed value of pattern parameter TNames, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pTNames) {
    return rawCountMatches(new Object[]{pTNames});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTNames the fixed value of pattern parameter TNames, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pTNames, final IMatchProcessor<? super TeacherWithoutClassNamesMatch> processor) {
    rawForEachMatch(new Object[]{pTNames}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTNames the fixed value of pattern parameter TNames, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pTNames, final IMatchProcessor<? super TeacherWithoutClassNamesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTNames}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pTNames the fixed value of pattern parameter TNames, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<TeacherWithoutClassNamesMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final String pTNames) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pTNames});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTNames the fixed value of pattern parameter TNames, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TeacherWithoutClassNamesMatch newMatch(final String pTNames) {
    return new TeacherWithoutClassNamesMatch.Immutable(pTNames);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for TNames.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfTNames(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_TNAMES, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for TNames.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfTNames() {
    return rawAccumulateAllValuesOfTNames(emptyArray());
  }
  
  @Override
  protected TeacherWithoutClassNamesMatch tupleToMatch(final Tuple t) {
    try {
    	return new TeacherWithoutClassNamesMatch.Immutable((java.lang.String) t.get(POSITION_TNAMES));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected TeacherWithoutClassNamesMatch arrayToMatch(final Object[] match) {
    try {
    	return new TeacherWithoutClassNamesMatch.Immutable((java.lang.String) match[POSITION_TNAMES]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected TeacherWithoutClassNamesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new TeacherWithoutClassNamesMatch.Mutable((java.lang.String) match[POSITION_TNAMES]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<TeacherWithoutClassNamesMatcher> querySpecification() throws IncQueryException {
    return TeacherWithoutClassNamesQuerySpecification.instance();
  }
}
