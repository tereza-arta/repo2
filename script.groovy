import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

void function() {
  writeFile file: 'groovy.txt', text: env.GIT_LOG
  String git_log = env.GIT_LOG
  String sub_msg = "refs/remotes/origin/main"
  assertThat(git_log, containsString(sub_msg));
}

return this
