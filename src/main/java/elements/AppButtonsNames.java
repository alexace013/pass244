package elements;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AppButtonsNames {
    PASSWORD("password"),
    GENERATE_BUTTON("Generate ".concat(PASSWORD.getButtonName())),
    CLEAR_BUTTON("Clear ".concat(PASSWORD.getButtonName())),
    SAVE_BUTTON("Save".concat(PASSWORD.getButtonName()));

    private String buttonName;
}