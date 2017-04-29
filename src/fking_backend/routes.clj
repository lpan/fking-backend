(ns fking-backend.routes
  (require [compojure.core :refer :all]
           [compojure.route :as route]
           [fking-backend.views.content :as v]))

(defroutes handler
  (GET "/" [] (v/index))
  (GET "/signin" [] (v/signin))
  (GET "/signup" [] (v/signup))
  ;; (GET "/users" [] (v/users))
  ;; (GET "/user/:id" [id] (v/user id))
  (route/not-found (v/not-found)))
