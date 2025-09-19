package fossils.fossils.client.blockentity.model.shringasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ShringasaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Body2;
	private final ModelPart backleftleg4;
	private final ModelPart backleftleg5;
	private final ModelPart backleftleg6;
	private final ModelPart backleftleg2;
	private final ModelPart backrightleg4;
	private final ModelPart backrightleg5;
	private final ModelPart backrightleg6;
	private final ModelPart backrightleg2;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart Body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart shoulder;
	private final ModelPart Neck;
	private final ModelPart frontleftleg4;
	private final ModelPart frontleftleg5;
	private final ModelPart frontleftleg6;
	private final ModelPart frontrightleg4;
	private final ModelPart frontrightleg5;
	private final ModelPart frontrightleg6;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart Neck2;
	private final ModelPart neck4;
	private final ModelPart Neck3;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;

	public ShringasaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Body2 = this.fossil.getChild("Body2");
		this.backleftleg4 = this.Body2.getChild("backleftleg4");
		this.backleftleg5 = this.backleftleg4.getChild("backleftleg5");
		this.backleftleg6 = this.backleftleg5.getChild("backleftleg6");
		this.backleftleg2 = this.backleftleg6.getChild("backleftleg2");
		this.backrightleg4 = this.Body2.getChild("backrightleg4");
		this.backrightleg5 = this.backrightleg4.getChild("backrightleg5");
		this.backrightleg6 = this.backrightleg5.getChild("backrightleg6");
		this.backrightleg2 = this.backrightleg6.getChild("backrightleg2");
		this.bone = this.Body2.getChild("bone");
		this.bone4 = this.Body2.getChild("bone4");
		this.Tail = this.Body2.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.Body = this.Body2.getChild("Body");
		this.body3 = this.Body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.shoulder = this.body4.getChild("shoulder");
		this.Neck = this.shoulder.getChild("Neck");
		this.frontleftleg4 = this.Neck.getChild("frontleftleg4");
		this.frontleftleg5 = this.frontleftleg4.getChild("frontleftleg5");
		this.frontleftleg6 = this.frontleftleg5.getChild("frontleftleg6");
		this.frontrightleg4 = this.Neck.getChild("frontrightleg4");
		this.frontrightleg5 = this.frontrightleg4.getChild("frontrightleg5");
		this.frontrightleg6 = this.frontrightleg5.getChild("frontrightleg6");
		this.bone2 = this.Neck.getChild("bone2");
		this.bone3 = this.Neck.getChild("bone3");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.neck4 = this.Neck2.getChild("neck4");
		this.Neck3 = this.neck4.getChild("Neck3");
		this.neck5 = this.Neck3.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.Head = this.neck7.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -16.0F, 9.8F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.4F, -8.0F, -0.5F, 1.0F, 24.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(6.8F, -16.0F, -13.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(0.3F, -5.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(5.3905F, -15.0F, -13.513F, 0.3442F, -0.0594F, -1.4066F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-1.9F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -16.0F, 10.3F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Body2 = fossil.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -16.9659F, 8.6503F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(23, 9).addBox(-0.5F, -1.6771F, 13.8749F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3264F, -14.2014F, -0.0698F, 0.0F, 0.0F));

		PartDefinition backleftleg4 = Body2.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0299F, 0.9363F, 1.4868F, 0.3054F, 0.3751F, -0.1053F));

		PartDefinition backleftleg5 = backleftleg4.addOrReplaceChild("backleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4575F, 5.9836F, 1.7127F, 0.6026F, -0.4724F, 0.2013F));

		PartDefinition backleftleg6 = backleftleg5.addOrReplaceChild("backleftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.113F, 9.2541F, 1.8083F, 0.2618F, 0.0F, 0.0F));

		PartDefinition backleftleg2 = backleftleg6.addOrReplaceChild("backleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.5F, -0.7854F, 0.0F, 0.0F));

		PartDefinition backrightleg4 = Body2.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0299F, 0.9363F, 1.4868F, 0.2193F, -0.3824F, 0.1031F));

		PartDefinition backrightleg5 = backrightleg4.addOrReplaceChild("backrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4575F, 5.9836F, 1.7127F, 0.1618F, 0.4484F, -0.2141F));

		PartDefinition backrightleg6 = backrightleg5.addOrReplaceChild("backrightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.113F, 9.2541F, 1.8083F, 0.0F, 0.0F, 0.0436F));

		PartDefinition backrightleg2 = backrightleg6.addOrReplaceChild("backrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone = Body2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4019F, 0.2973F, 6.7139F, 0.0F, 0.0F, 0.1745F));

		PartDefinition bone4 = Body2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4019F, 0.2973F, 6.7139F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Tail = Body2.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1388F, 7.8175F, -0.0825F, 0.2174F, -0.0178F));

		PartDefinition cube_r5 = Tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(47, 14).addBox(-0.5F, -0.6626F, 4.8064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(42, 9).addBox(-0.5F, -0.6626F, -0.8936F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2787F, 0.3822F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(32, 39).addBox(-0.5F, -0.0281F, -0.0798F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7166F, 5.8009F, 0.0906F, 0.1738F, 0.0157F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(55, 25).addBox(-0.5F, -0.2886F, -0.3036F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(59, 29).addBox(-0.5F, -0.2886F, 4.3964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2599F, 5.7629F, 0.1524F, 0.2157F, 0.0329F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(43, 47).addBox(-0.5F, 0.5184F, -0.0607F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7761F, 4.8736F, 0.141F, 0.2593F, 0.0364F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, 0.5184F, -0.5607F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(4, 53).addBox(-0.5F, 0.5184F, 4.1393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0363F, 4.7717F, 0.2645F, 0.2108F, 0.0566F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(30, 47).addBox(-0.5F, 0.5184F, 0.0393F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.01F, 4.6572F, -0.0034F, 0.1309F, -0.0004F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(47, 39).addBox(-0.5F, 0.5184F, -0.1607F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0099F, 4.9253F, -0.0928F, -0.2173F, 0.0201F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, 0.5184F, -0.2607F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.045F, 4.9161F, -0.2228F, -0.2983F, 0.0665F));

		PartDefinition Body = Body2.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(52, 54).addBox(-0.5F, -0.8802F, -4.8499F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5235F, -0.0541F, -0.091F, -0.1337F, -0.0255F));

		PartDefinition body3 = Body.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(39, 54).addBox(-0.5F, -0.0943F, -4.6137F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7859F, -4.9111F, 0.1577F, -0.0862F, -0.0137F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(26, 54).addBox(-0.5F, -0.0943F, -5.2387F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(30, 58).addBox(-0.5F, -0.0943F, -0.5387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.7F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition shoulder = body4.addOrReplaceChild("shoulder", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2972F, -5.0528F, 0.1051F, -0.0868F, -0.0091F));

		PartDefinition cube_r6 = shoulder.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0F, -5.3F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Neck = shoulder.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(13, 51).addBox(-0.5F, -0.0598F, -5.1649F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(16, 54).addBox(-0.5F, -0.0598F, -0.4649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0196F, -5.7755F, -0.2393F, 0.0F, 0.0F));

		PartDefinition frontleftleg4 = Neck.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1041F, 7.5692F, -0.6134F, 0.9068F, 0.0632F, 1.0674F));

		PartDefinition frontleftleg5 = frontleftleg4.addOrReplaceChild("frontleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(7.5316F, 7.233F, 2.262F, -0.616F, 0.1185F, -2.4537F));

		PartDefinition frontleftleg6 = frontleftleg5.addOrReplaceChild("frontleftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5842F, 7.7926F, -1.3614F, 1.3371F, -1.2627F, 0.8924F));

		PartDefinition frontrightleg4 = Neck.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1041F, 7.5692F, -0.6134F, 0.8488F, 0.3423F, -0.5815F));

		PartDefinition frontrightleg5 = frontrightleg4.addOrReplaceChild("frontrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.5316F, 7.233F, 2.262F, -0.6939F, -0.7419F, 1.3527F));

		PartDefinition frontrightleg6 = frontrightleg5.addOrReplaceChild("frontrightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5842F, 7.7926F, -1.3614F, -0.5526F, 1.2878F, -0.7697F));

		PartDefinition bone2 = Neck.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.119F, 3.3064F, 0.4011F, 0.2356F, 0.1309F, -0.1745F));

		PartDefinition bone3 = Neck.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.119F, 3.3064F, 0.4011F, 0.2356F, -0.1309F, 0.1745F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.313F, -4.8762F, 0.179F, -0.0138F, -0.1784F));

		PartDefinition cube_r7 = Neck2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(60, 37).addBox(-0.5F, -0.2302F, 4.171F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.261F, -8.2263F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck4 = Neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2714F, -3.952F, 0.0244F, -0.1691F, -0.0508F));

		PartDefinition cube_r8 = neck4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(27, 61).addBox(-0.5F, -0.2302F, 0.471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Neck3 = neck4.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(66, 32).addBox(-0.5F, -0.233F, -3.2772F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(68, 34).addBox(-0.5F, -0.233F, -0.5772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1F, -3.8F, 0.0839F, -0.2609F, -0.0217F));

		PartDefinition neck5 = Neck3.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(68, 24).addBox(-0.5F, -0.3F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.067F, -2.8272F, 0.0358F, -0.218F, -0.0077F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(90, 40).addBox(-0.5F, -0.3F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0206F, -2.7692F, 0.2531F, 0.0F, 0.0F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create().texOffs(47, 61).addBox(-0.5F, 0.3243F, -3.8812F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6331F, -2.0424F, 0.2568F, -0.1689F, -0.0441F));

		PartDefinition Head = neck7.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4708F, -3.3867F, -0.2162F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.8F, 1.6697F, -3.4784F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.8F, 1.6697F, -3.4784F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5072F, -0.286F, 0.8639F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}