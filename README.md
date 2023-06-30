# dialog-hilt-viewmodel-bug
Reproduction steps for bug with SavedStateHandle restoration in dialog view models

Reproduction steps:
- Enable "Don't Keep activities" in developer options
- Launch the app
- In logcat filter by `tag:SavedStateHandleLog` to watch output
- On the homescreen, when the view model is initialised the saved state handle is empty.
- Clicking "Set Value" sets a value `foo` in the `SavedStateHandle` for the `HomescreenViewModel`.
- Click "Open Dialog"
- Click "Set Value" sets a value `bar` in the `SavedStateHandle` for the `DialogViewModel`.
- Leave the app, then return
- See that the `SavedStateHandle` is restored for the `HomescreenViewModel` but not the `DialogViewModel`

<video src="https://github.com/LukeMannering/dialog-hilt-viewmodel-bug/assets/1769850/79c03721-ed96-499b-8f5b-04ce8a78cc78"/>

