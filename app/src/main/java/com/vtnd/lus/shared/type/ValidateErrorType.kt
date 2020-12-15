package com.vtnd.lus.shared.type

class ValidateErrorType {

    interface ErrorType<T> {
        val message: T
    }

    enum class EmailErrorType : ErrorType<String?> {
        EMAIL_EMPTY {
            override val message: String?
                get() = "Empty, please enter!"
        },
        INVALID_EMAIL {
            override val message: String?
                get() = "Invalid email format!"
        },
        LEAST_CHARACTER {
            override val message: String?
                get() = "Please enter at least 6 characters!"
        },
        NONE {
            override val message: String?
                get() = null
        }
    }

    enum class PasswordErrorType : ErrorType<String?> {
        PASSWORD_EMPTY {
            override val message: String?
                get() = "Empty, please enter!"
        },
        LEAST_CHARACTER {
            override val message: String?
                get() = "Please enter at least 6 characters!"
        },
        NONE {
            override val message: String?
                get() = null
        }
    }

    enum class UserNameErrorType : ErrorType<String?> {
        USER_NAME_EMPTY {
            override val message: String?
                get() = "Empty, please enter!"
        },
        LEAST_CHARACTER {
            override val message: String?
                get() = "Please enter at least 6 characters!"
        },
        NONE {
            override val message: String?
                get() = null
        }
    }
    enum class BaseErrorType : ErrorType<String?> {
        IS_EMPTY {
            override val message: String?
                get() = "Empty, please enter!"
        },
        LEAST_CHARACTER {
            override val message: String?
                get() = "Please enter at least 6 characters!"
        },
        LEAST_IMAGES {
            override val message: String?
                get() = "Please enter at least 2 image!"
        },
        LEAST_SERVICES {
            override val message: String?
                get() = "Please enter at least 1 service!"
        },
        NONE {
            override val message: String?
                get() = null
        }
    }
    enum class PhoneErrorType : ErrorType<String?> {
        PHONE_EMPTY {
            override val message: String?
                get() = "Empty, please enter!"
        },
        INVALID_PHONE {
            override val message: String?
                get() =  "Invalid phone number"
        },
        NONE {
            override val message: String?
                get() = null
        }
    }

    enum class CodeErrorType : ErrorType<String?> {
        CODE_EMPTY {
            override val message: String?
                get() = "Empty, please enter!"
        },
        INVALID_CODE {
            override val message: String?
                get() =  "Invalid code number"
        },
        NONE {
            override val message: String?
                get() = null
        }
    }

}
