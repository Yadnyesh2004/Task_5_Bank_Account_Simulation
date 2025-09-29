# My Bank Account Simulation - 

## Overview
"I created a Java program that simulates a bank account system with user interaction through the terminal."

### 1. Account Class
**What I did here:**
- Created private variables to store:
    - `accountHolder` - person's name
    - `balance` - their money
    - `transactionHistory` - ArrayList to track all transactions

- **Made a constructor** that:
    - Takes name and initial deposit
    - Sets up the account
    - Adds first entry to history

- **Created deposit() method** that:
    - Checks if amount is positive
    - Adds money to balance
    - Records transaction in history
    - Shows success message

- **Created withdraw() method** that:
    - Validates amount is positive
    - Checks if enough balance exists
    - Subtracts from balance if valid
    - Shows error if insufficient funds

- **Made checkBalance()** - displays current balance
- **Made showHistory()** - loops through ArrayList and prints all transactions

### 2. Main Class (BankSimulation)
**What I did here:**
- Created Scanner object to read user input
- Made a welcome screen with box borders
- Asked user for name and initial deposit
- Created Account object with their details

### 3. Menu System
**I implemented:**
- A while loop that runs until user exits
- Menu with 5 options displayed each time
- Scanner to read user's choice
- Switch-case statement to handle each option:
    - Case 1: Calls deposit method
    - Case 2: Calls withdraw method
    - Case 3: Shows balance
    - Case 4: Shows transaction history
    - Case 5: Sets running=false to exit

### 4. User Input Handling
**What I added:**
- Used `scanner.nextLine()` for name input
- Used `scanner.nextDouble()` for money amounts
- Used `scanner.nextInt()` for menu choices

### 5. Validation & Error Handling
**I implemented checks for:**
- Negative deposit amounts - shows error
- Withdrawal more than balance - shows "insufficient funds"
- Invalid menu options - default case in switch
- Zero or negative withdrawals - validation in method

### 6. Visual Elements
**I added:**
- Box borders using ╔═╗╚╝ characters
- Success symbols (✓) for completed actions
- Error symbols (✗) for failed actions
- Formatted menu with ═══ lines
- Clear spacing with `\n` for readability

### 7. Transaction Tracking
**What I did:**
- Every action gets added to ArrayList as a String
- Format: "Action: $amount | New Balance: $balance"
- Initial deposit also gets recorded
- History shows all transactions in order

## Program Flow I Created

1. **Start** → Show welcome message
2. **Setup** → Get name and initial deposit
3. **Create** → Make Account object
4. **Loop** → Show menu, get choice, execute action
5. **Process** → Based on choice, call appropriate method
6. **Repeat** → Go back to menu unless exit chosen
7. **End** → Show goodbye message and close Scanner

## Key Programming Concepts I Used

- **Classes and Objects** - Account class, creating account object
- **Methods** - deposit(), withdraw(), checkBalance(), showHistory()
- **Data Types** - String, double, boolean, int
- **Collections** - ArrayList for transaction history
- **Loops** - while loop for menu
- **Conditionals** - if-else for validation, switch for menu
- **Scanner** - For all user inputs
- **Access Modifiers** - private fields, public methods

"That's basically everything I implemented - a complete banking system that handles user accounts, validates inputs, tracks transactions, and provides a clean interface for users to interact with."