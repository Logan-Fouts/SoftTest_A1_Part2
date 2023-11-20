package model;

import java.time.LocalDate;

public class Task {
  private String title;
  private String description;
  private LocalDate alertDate;

  public Task(String givenTitle) {
    if (givenTitle == null || givenTitle.trim().isEmpty()) {
      throw new IllegalArgumentException("Title cannot be null or empty");
    }
    this.title = givenTitle;
    this.alertDate = null;
  }

  public Task(String givenTitle, String givenDescription, String givenAlertDate) {
    this(givenTitle);
    this.title = givenTitle;
    this.description = givenDescription;
    this.alertDate = LocalDate.parse(givenAlertDate);
  }

  // The alert date given as a string in "YYYY-MM-DD" format.
  public void setAlertDate(String givenAlertDate) {
    this.alertDate = LocalDate.parse(givenAlertDate); 
  }

  public void setDescription(String givenDescription) {
    this.description = givenDescription;
  }

  public String getDescription() {
    return this.description;
  }

  public String getTitle() {
    return this.title;
  }

  public LocalDate getAlertDate() {
    return this.alertDate;
  }
}
