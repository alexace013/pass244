package app;

import elements.AppButtonsNames;

public interface IAppPass244 {

    /**
     * @implNote should be inputs 2 dates (date 1 & date2)
     */
    void inputDate(final String date);

    /**
     * @implNote click on Generate/Clear/Save buttons
     * @see AppButtonsNames
     */
    void clickButton(AppButtonsNames buttonName);

}