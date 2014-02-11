package school.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.context.EMFPatternMatcherContext;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.PQuery.PQueryStatus;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.TeachesTheMostCoursesMatcher;
import school.util.TeachesMoreClassesQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate TeachesTheMostCoursesMatcher in a type-safe way.
 * 
 * @see TeachesTheMostCoursesMatcher
 * @see TeachesTheMostCoursesMatch
 * 
 */
@SuppressWarnings("all")
public final class TeachesTheMostCoursesQuerySpecification extends BaseGeneratedQuerySpecification<TeachesTheMostCoursesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachesTheMostCoursesQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TeachesTheMostCoursesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TeachesTheMostCoursesMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.teachesTheMostCourses";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("T");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("T", "school.Teacher"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() {
    return bodies;
  }
  
  private TeachesTheMostCoursesQuerySpecification() throws IncQueryException {
    super();
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    {
      PBody body = new PBody(this);
      PVariable var_T = body.getOrCreateVariableByName("T");
      PVariable var__Tx = body.getOrCreateVariableByName("_Tx");
      new ExportedParameter(body, var_T, "T");
      new TypeUnary(body, var_T, getClassifierLiteral("http://school.ecore", "Teacher"), "http://school.ecore/Teacher");
      new NegativePatternCall(body, new FlatTuple(var__Tx, var_T), TeachesMoreClassesQuerySpecification.instance());
      body.setSymbolicParameters(Arrays.asList(var_T));
      bodies.add(body);
    }
    setStatus(PQueryStatus.OK);
  }
  
  private Set<PBody> bodies = Sets.newHashSet();;
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<TeachesTheMostCoursesQuerySpecification> {
    @Override
    public TeachesTheMostCoursesQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static TeachesTheMostCoursesQuerySpecification INSTANCE = make();
    
    public static TeachesTheMostCoursesQuerySpecification make() {
      try {
      	return new TeachesTheMostCoursesQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}