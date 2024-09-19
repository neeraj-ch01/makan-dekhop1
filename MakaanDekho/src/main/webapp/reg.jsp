<!DOCTYPE html>
<html lang="en">

<head>
<%@ include file="header.jsp" %>
    
        <!-- Search End -->


        <!-- Contact Start -->
        <div class="container-xxl py-5">
            <div class="container">
              
                <div class="row g-4">
                   
                    <div class="col-md-6 wow fadeInUp" data-wow-delay="0.1s">
                        <iframe class="position-relative rounded w-100 h-100"
                            src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3001156.4288297426!2d-78.01371936852176!3d42.72876761954724!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4ccc4bf0f123a5a9%3A0xddcfc6c1de189567!2sNew%20York%2C%20USA!5e0!3m2!1sen!2sbd!4v1603794290143!5m2!1sen!2sbd"
                            frameborder="0" style="min-height: 400px; border:0;" allowfullscreen="" aria-hidden="false"
                            tabindex="0"></iframe>
                    </div>
                    <div class="col-md-6">
                        <div class="wow fadeInUp" data-wow-delay="0.5s">
                           <h3>User Registration</h3>
                            <form action="CustReg" method="post">
                                <div class="row g-3">
                                    <div class="col-md-6">
                                        <div class="form-floating">
                                            <input type="text" class="form-control" name="cname" placeholder="Your Name">
                                            <label for="name">Your Name</label>
                                        </div>
                                    </div>
                                      <div class="col-md-6">
                                        <div class="form-floating">
                                            <input type="text" class="form-control" name="cadd" placeholder="Your Address">
                                            <label for="cadd">Your Address</label>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-floating">
                                            <input type="email" class="form-control" name="cemail" placeholder="Your Email">
                                            <label for="email">Your Email</label>
                                        </div>
                                    </div>
                                    <div class="col-12">
                                        <div class="form-floating">
                                            <input type="text" class="form-control" name="mob" placeholder="Mobile">
                                            <label for="Mobile">Mobile</label>
                                        </div>
                                    </div>
                                     <div class="col-12">
                                        <div class="form-floating">
                                            <input type="number" min=1 max=2 class="form-control" name="salpur" >
                                            <label for="Mobile">Sale-1/Purchase-2</label>
                                        </div>
                                    </div>
                                        <div class="col-12">
                                        <div class="form-floating">
                                            <input type="text" class="form-control" name="unm" placeholder="UserName">
                                            <label for="unm">UserName</label>
                                        </div>
                                    </div>
                                        <div class="col-12">
                                        <div class="form-floating">
                                            <input type="password" class="form-control" name="pw" >
                                            <label for="pw">Password</label>
                                        </div>
                                    </div>
                                    <div class="col-12">
                                        <button class="btn btn-primary w-100 py-3" type="submit">Send Message</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Contact End -->

 <%@ include file="footer.jsp" %>
</body>

</html>
