(ns fking-backend.routes
  (require [compojure.core :refer :all]
           [compojure.route :as route]
           [fking-backend.views.content :as v]))

(defroutes handler
  (GET "/" [] (v/index))
  (GET "/signin" [] (v/signin))
  (GET "/signup" [] (v/signup))
  (route/not-found (v/not-found)))
