package spring.springblog.models;

import javax.persistence.*;


    @Entity
    @Table(name="ads")
    public class Ad {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(nullable = false, length = 1500)
        private String description;

        @Column(nullable = false)
        private String title;

        public Ad() {

        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Ad(String title, String description){
            this.title = title;
            this.description = description;
        }
    }

