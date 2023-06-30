# dialog-hilt-viewmodel-bug
Reproduction steps for bug with SavedStateHandle restoration in dialog view models

Reproduction steps:
- Enable "Don't Keep activities" in developer options
- Launch the app
- On the homescreen, when the view model is initialised the saved state handle is empty.
- Clicking "Set Value" sets a key called `foo` in the `SavedStateHandle` for the `HomescreenViewModel`..
- Click "Open Dialog"
- Click "Set Value" sets a key called `bar` in the `SavedStateHandle` for the `DialogViewModel`.
- Leave the app, then return
- See that the `SavedStateHandle` is restored for the `HomescreenViewModel` but not the `DialogViewModel`

I've also shown the same effect happening if you use `rememberSaveable` in the composable as 


<video src="https://github.com/LukeMannering/dialog-hilt-viewmodel-bug/assets/1769850/2d28d790-3468-48b8-8e2c-5aea1567ec1d"/>

