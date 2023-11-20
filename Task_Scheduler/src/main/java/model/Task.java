package model;

import java.time.LocalDate;

public class Task {
  private String title;
  private LocalDate alertDate;

  public Task(String givenTitle) {
    this.title = givenTitle;
    this.alertDate = LocalDate.now();
  }

  /**
   * Sets the alert date from a string.
   *
   * @param givenAlertDate The alert date as a string in "YYYY-MM-DD" format.
   */
  public void setAlertDate(String givenAlertDate) {
    this.alertDate = LocalDate.parse(givenAlertDate);
  }

  public String getTitle() {
    return this.title;
  }

  public LocalDate getAlertDate() {
    return this.alertDate;
  }
}
