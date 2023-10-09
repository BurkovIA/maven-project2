package org.example;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        class DbSetting {

            private String name;
            private String password;

            public DbSetting(String name, String password) {
                this.name = name;
                this.password = password;
            }

        }

        class MyEntity {

            private UUID id;
            private String name;

            public MyEntity(String name) {
                this.name = name;
            }

            public UUID getId() {
                return id;
            }

            public void setId(UUID id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return new StringBuilder().append("MyEntity{").append("id=").append(id).append(", name='").append(name).append('\'').append('}').toString();
            }
        }
        class myEntity {

            private UUID id;
            private String name;

            public myEntity(String name) {
                this.name = name;
            }

            public UUID getId() {
                return id;
            }

            public void setId(UUID id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return new StringBuilder().append("MyEntity{").append("id=").append(id).append(", name='").append(name).append('\'').append('}').toString();
            }
        }

    }

}