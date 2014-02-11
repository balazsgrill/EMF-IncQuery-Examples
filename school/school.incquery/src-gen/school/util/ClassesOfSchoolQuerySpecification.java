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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import school.ClassesOfSchoolMatcher;

/**
 * A pattern-specific query specification that can instantiate ClassesOfSchoolMatcher in a type-safe way.
 * 
 * @see ClassesOfSchoolMatcher
 * @see ClassesOfSchoolMatch
 * 
 */
@SuppressWarnings("all")
public final class ClassesOfSchoolQuerySpecification extends BaseGeneratedQuerySpecification<ClassesOfSchoolMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ClassesOfSchoolQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ClassesOfSchoolMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ClassesOfSchoolMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.classesOfSchool";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("SC");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("SC", "school.SchoolClass"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() {
    return bodies;
  }
  
  private ClassesOfSchoolQuerySpecification() throws IncQueryException {
    super();
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    {
      PBody body = new PBody(this);
      PVariable var_SC = body.getOrCreateVariableByName("SC");
      new ExportedParameter(body, var_SC, "SC");
      new TypeUnary(body, var_SC, getClassifierLiteral("http://school.ecore", "SchoolClass"), "http://school.ecore/SchoolClass");
      body.setSymbolicParameters(Arrays.asList(var_SC));
      bodies.add(body);
    }
    setStatus(PQueryStatus.OK);
  }
  
  private Set<PBody> bodies = Sets.newHashSet();;
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<ClassesOfSchoolQuerySpecification> {
    @Override
    public ClassesOfSchoolQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static ClassesOfSchoolQuerySpecification INSTANCE = make();
    
    public static ClassesOfSchoolQuerySpecification make() {
      try {
      	return new ClassesOfSchoolQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}