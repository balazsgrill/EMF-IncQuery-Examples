package school.coursewithteacher;

import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import school.Course;
import school.coursewithteacher.CourseWithTeacherMatch;

/**
 * A match processor tailored for the CourseWithTeacher pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class CourseWithTeacherProcessor implements IMatchProcessor<CourseWithTeacherMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pC the value of pattern parameter C in the currently processed match 
   * 
   */
  public abstract void process(final Course C);
  
  @Override
  public void process(final CourseWithTeacherMatch match) {
    process(match.getC());  				
    
  }
}