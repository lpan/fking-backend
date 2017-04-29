(ns fking-backend.routes
  (require [compojure.core :refer :all]
           [compojure.route :as route]
           [fking-backend.views.content :as v]))

(defroutes handler
  (GET "/" [] (v/index))
  (route/not-found (v/not-found)))
