#Account Holder Mutations:
createAccount(accountHolderInput: AccountHolderInput): String: 
Creates a new account holder with the provided input data and returns a string message indicating success or failure.
#deleteAccount(id: ID): String: 
Deletes an account holder with the specified ID and returns a string message indicating success or failure.
#findByEmail(email: String): AccountHolder: 
Finds an account holder by their email address and returns the account holder object.
#login(email: String, password: String): AccountHolder: 
Authenticates an account holder using their email and password and returns the account holder object if successful.
#Task Mutations:
createTask(taskInput: TaskInput): String: 
Creates a new task with the provided input data and returns a string message indicating success or failure.
#deleteTask(id: ID): String: 
Deletes a task with the specified ID and returns a string message indicating success or failure.
#Project Mutations:
createProject(projectInput: ProjectInput): String
Creates a new project with the provided input data and returns a string message indicating success or failure.
deleteProject(id: ID): String: Deletes a project with the specified ID and returns a string message indicating success or failure.
#Task Query:
getAllTask: [Task]: Retrieves all tasks and returns a list of task objects. 
Project Query:
getAllProject: [Project]: Retrieves all projects and returns a list of project objects. 
