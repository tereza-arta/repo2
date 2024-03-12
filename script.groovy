import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

void function() {
  writeFile file: 'groovy.txt', text: env.TARGET_BRANCH
  def line = env.TARGET_BRANCH
  echo line
  assert line.toString().contains('merge dev to main')
}

return this
