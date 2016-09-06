import org.example.Book
class BootStrap {

    def init = { servletContext ->
		if(!Book.count()){
			new Book(author: "Stephen King", title: "The shining").save(failOnError:true)
			new Book(author: "James Patterson", title: "Along came a spider").save(failOnError:true)
		}
    }
    def destroy = {
    }
}
